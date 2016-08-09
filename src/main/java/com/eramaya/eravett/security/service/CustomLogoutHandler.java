package com.eramaya.eravett.security.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

public class CustomLogoutHandler extends SimpleUrlLogoutSuccessHandler {
	
//	@Autowired
//	UserLoginRepository userLoginRepository;
	
	@Override
	public void onLogoutSuccess(final HttpServletRequest request, final HttpServletResponse response, final Authentication authentication)
            throws IOException, ServletException {
		if(authentication!=null && authentication.getPrincipal()!=null){
			final UserDetail userDetail = (UserDetail) authentication.getPrincipal();
//			UserLogin userLogin=userLoginRepository.findOne(userDetail.getLoginId());
//			if(userLogin!=null){
//				DateFormat formatDate = new SimpleDateFormat("DD-MM-yyyy");
//			    DateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
//				userLogin.setLogoutdate(formatDate.format(new Date()));
//		    	userLogin.setLogouttime(formatTime.format(new Date()));
//		    	userLoginRepository.save(userLogin);
//			}
		}
		super.handle(request, response, authentication);
    }

}
