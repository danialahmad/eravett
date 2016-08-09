package com.eramaya.eravett.security.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.transaction.annotation.Transactional;

//import com.utusan.jobhouse.bean.NavMenuAop;

public class CustomAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	//@Autowired
	//private NavMenuAop navMenuAop;
//	@Autowired
//	UserLoginRepository userLoginRepository;
	
    @Override
    @Transactional
    public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
            final Authentication authentication) throws ServletException, IOException {
    	final UserDetail userDetail = (UserDetail) authentication.getPrincipal();
    	//navMenuAop.setInitialize(false);
//    	DateFormat formatDate = new SimpleDateFormat("DD-MM-yyyy");
//	    DateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
//	    HttpSession ssn = request.getSession();
//    	
//    	UserLogin userLogin= new UserLogin();
//    	userLogin.setLogindate(formatDate.format(userDetail.getLastLogin()));
//    	userLogin.setLogintime(formatTime.format(userDetail.getLastLogin()));
//    	userLogin.setLoginremark(request.getRemoteAddr());
//    	userLogin.setUserid(userDetail.getUsername());
//    	userLogin.setSessionno(ssn.getId());
//    	userLogin=userLoginRepository.save(userLogin);
//    	userDetail.setLoginId(userLogin.getRecid());
    	
    	super.onAuthenticationSuccess(request, response, authentication);
    }

}
