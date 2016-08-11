package com.eramaya.eravett.web.controller.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eramaya.eravett.service.registration.RegistrationService;
import com.eramaya.eravett.web.form.JsonResponse;
import com.eramaya.eravett.web.form.UserForm;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping("/module/registration/register")
	public @ResponseBody JsonResponse register(@ModelAttribute("form") UserForm form){
		JsonResponse response = new JsonResponse();
		try {
			registrationService.register(form);
			response.setStatus("success");
		} catch(Exception e) {
			e.printStackTrace();
			response.setStatus("error");
		}
		return response;
	}
}
