package com.eramaya.eravett.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

	
	public UserDetail getUserDetail(){
		UserDetail ud = null;
		if(SecurityContextHolder.getContext().getAuthentication()!=null){
			ud = (UserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		return ud;
	}
	
	public String getUsername(){
		String username = "";
		if(SecurityContextHolder.getContext().getAuthentication()!=null){
			username = SecurityContextHolder.getContext().getAuthentication().getName();
		} else {
			username = "anonymousUser";
		}	
		return username;
	}
	
	public String getName(){
		String name = "";
		if(SecurityContextHolder.getContext().getAuthentication()!=null){
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			UserDetail userDetail = (UserDetail) authentication.getPrincipal();
			name = userDetail.getDisplayName();
		} 
		return name;
	}
	
	public List<String> getRoles(){
		List<String> list= new ArrayList<String>();
		//list = actIdUserGenericService.getRepository().getRoles(this.getUsername());
		return list;
	}
	
}
