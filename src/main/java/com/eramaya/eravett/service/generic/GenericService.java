package com.eramaya.eravett.service.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericService<T, ID extends Serializable,R> {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private JpaRepository<T, ID> jpaRepository;
	
	@Autowired
	private R repository;
	
	@Autowired
	private GenericCacheService<T, ID> genericCacheService;
	
	private Class<T> clazz;
	
	private String[] cacheToEvicts;
	
	@SuppressWarnings("unchecked")
	public GenericService(){
		super();
		Type t = getClass().getGenericSuperclass();
		if (t instanceof ParameterizedType) {
			this.clazz = (Class<T>) ((ParameterizedType) t)
					.getActualTypeArguments()[0];
		} else if (((Class<?>) t).getGenericSuperclass() instanceof ParameterizedType) {
			this.clazz = (Class<T>) ((ParameterizedType) ((Class<?>) t)
					.getGenericSuperclass()).getActualTypeArguments()[0];
		} else {
			this.clazz = (Class<T>) ((ParameterizedType) ((Class<?>) ((Class<?>) t)
					.getGenericSuperclass()).getGenericSuperclass())
					.getActualTypeArguments()[0];
		}
	}
	
	public GenericService(final JpaRepository<T, ID> jpaRepository){
		this.jpaRepository = jpaRepository;
	}
	
	public abstract ID getID(T entity);
	
	public R getRepository(){
		return this.repository;
	}
	
	public T findOne(final ID id) {
		T t = genericCacheService.get(clazz, id);
		if(t!=null) return t;
		else {
			T tDb = jpaRepository.findOne(id);
			if(tDb!=null)
				genericCacheService.put(clazz, id, tDb);
			return tDb;
		}
	}
	
	public List<T> findAll(){
		List<T> list = genericCacheService.getAll(clazz);
		if(list == null){
			list = jpaRepository.findAll();
			genericCacheService.putAll(clazz, list);
		}
		return list;
	}
	
	
	public T save(final T entity) {
		T t = jpaRepository.save(entity);
		ID id = getID(t);
		genericCacheService.put(clazz, id, t);
		evictThisCache();
		return t;
	}
	
	public T save(final T entity, String... cacheToEvicts) {
		T t = jpaRepository.save(entity);
		ID id = getID(t);
		genericCacheService.put(clazz, id, t);
		if(cacheToEvicts!=null){
			setCacheToEvicts(cacheToEvicts);
			evictThisCache();
		}
		return t;
	}
	
	private void evictThisCache(){
		genericCacheService.evictThisCache(cacheToEvicts);
	}
	
//	public void evictCache(String... cacheToEvicts){
//		genericCacheService.evictThisCache(cacheToEvicts);
//	}

	public Long count() {
		Long count = genericCacheService.getCount(clazz);
		if(count == null){
			count = jpaRepository.count();
			genericCacheService.putCount(clazz, count);
		}
		return count;
	}
	
	public void delete(final ID id){
		jpaRepository.delete(id);
		genericCacheService.remove(clazz, id);
		evictThisCache();
	}
	
	public boolean isExist(final ID id) {
		if(findOne(id)!=null) return true;
		return false;
	}

	public void setCacheToEvicts(final String... cacheToEvicts) {
		this.cacheToEvicts = cacheToEvicts;
	}
	
	public void evictThisCache(String... cacheToEvicts){
		genericCacheService.evictThisCache(cacheToEvicts);
	}

}
