package com.eramaya.eravett.web.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	//	model.addAttribute("menuList",menuService.getMasterMenu());
		//model.addAttribute("menuList",menuService.getMasterMenu(securityService.getUsername()));
		return "home";
	}
	
}
