package com.eramaya.eravett.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.eramaya.eravett.security.service.UserDetail;

@Controller
public class LoginController {
	
	@Autowired
	MessageSource messageSource;

	/** Login form */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView loginPage(Locale locale,
			@RequestParam(value = "errorMessage", required = false) String errorMessage) {
		final SecurityContext securityContext = SecurityContextHolder.getContext();
		final ModelAndView mav = new ModelAndView();
		if (securityContext != null && securityContext.getAuthentication() != null) {
			if (securityContext.getAuthentication().getPrincipal() instanceof UserDetail) {
				return new ModelAndView(new RedirectView("/", true));
			}
		}
//		if (errorMessage != null) {
//			String s = messageSource.getMessage(errorMessage, null, locale);
//			mav.addObject("errorMessage", s);
//		}
		return mav;
	}
	
	/** Login form with error. */
	@RequestMapping("/login-error")
	public String loginError(final Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}

}
