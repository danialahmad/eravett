package com.eramaya.eravett.web.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eramaya.eravett.security.service.SecurityService;
import com.eramaya.eravett.security.service.UserDetail;

@Controller
public class SecurityController {

	@Autowired
	SecurityService securityService;
	
	@RequestMapping(value = "/api/security/user", method = RequestMethod.GET)
	@ResponseBody
	public UserDetail getUser() {
	   
		return securityService.getUserDetail();
	}
	
}
