package com.eramaya.eravett.service.generic;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * GenericCache for GenericService only!
 * cacheName = by entity.getClasName
 * key = cacheName + ID pk
 * value = entity object
 * @author tab
 *
 * @param <T>
 * @param <ID>
 */
@Slf4j
@Service
public class GenericCacheService<T, ID> {
	
	private final Logger logger = LoggerFactory.getLogger(GenericCacheService.class);
	
	private Class<T> clazz;
	
	@Autowired
	private CompositeCacheManager cacheManager;
	
	public GenericCacheService(){
	}
	
	private Cache getCache() {
        return cacheManager.getCache(clazz.getSimpleName());
	}
	
	private Cache getCacheCount(){
		String clazzSimpleName = clazz.getSimpleName();
		String cacheName = clazzSimpleName + ".count";
		return cacheManager.getCache(cacheName);
	}
	
	private Cache getCacheAll(){
		String clazzSimpleName = clazz.getSimpleName();
		String cacheName = clazzSimpleName + ".all";
		return cacheManager.getCache(cacheName);
	}
	
	private String getCacheName(){
		return clazz.getSimpleName();
	}

	private String getKey(final ID id) {
		return getCacheName() + "-" + id;
	}
	
	@SuppressWarnings("unchecked")
	
	public T get(final Class<T> clazz, final ID id) {
		this.clazz = clazz;
		String cacheName = getCacheName();
		String key = getKey(id);
		logger.info("Cache Get [" + cacheName + " | " + key + "]");
		if(getCache().get(key)!=null){
			return (T) getCache().get(key).get();
		}
		return null;
	}
	
	
	public void put(final Class<T> clazz, final ID pk, final T entity) {
		this.clazz = clazz;
		String cacheName = getCacheName();
		String key = getKey(pk);
		logger.info("Cache Put [" + cacheName + " | " + key + "]");
//		Element element = new Element(key, entity);
		getCache().put(key, entity);
	}
	
	
	public void remove(final Class<T> clazz, final ID id) {
		this.clazz = clazz;
		String cacheName = getCacheName();
		String key = getKey(id);
		logger.info("Cache Remove [" + cacheName + " | " + key + "]");
		getCache().evict(key);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll(Class<T> clazz) {
		this.clazz = clazz;
		String KEY = "all";
		logger.info("Cache Get All [" + clazz.getSimpleName() + "]");
		Cache cache = getCacheAll();
		if(cache.get(KEY)!=null){
			return (List<T>) cache.get(KEY).get();
		}
		return null;
	}
	
	public Long getCount(final Class<T> clazz) {
		this.clazz = clazz;
		String KEY = "count";
		logger.info("Cache Get Count [" + clazz.getSimpleName() + "]");
		Cache cache = getCacheCount();
		if(cache.get(KEY)!=null){
			return Long.valueOf(String.valueOf(cache.get(KEY).get()));
		}
		return null;
	}

	
	public void putCount(final Class<T> clazz, final Long count) {
		this.clazz = clazz;
		String key = "count";
		Cache cache = getCacheCount();
		logger.info("Cache Put Count [" + clazz.getSimpleName() + "]");
//		Element element = new Element(key, count);
		cache.put(key, count);
	}

	public void putAll(Class<T> clazz, List<T> list) {
		this.clazz = clazz;
		String key = "all";
		Cache cache = getCacheAll();
		logger.info("Cache Put All [" + clazz.getSimpleName() + "]");
		cache.put(key, list);
	}
	
	
	public void evictThisCache(String[] cacheToEvicts){
		if(cacheToEvicts!=null){
			List<String> cacheName = Arrays.asList(cacheToEvicts);
			for(String cn : cacheName){
				log.warn("Clear cache " + cn);
				cacheManager.getCache(cn).clear();
			}
		}
		getCacheAll().clear();
		getCacheCount().clear();
	}
	
	

}
