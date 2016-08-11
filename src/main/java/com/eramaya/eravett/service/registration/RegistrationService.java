package com.eramaya.eravett.service.registration;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eramaya.eravett.model.entity.Address;
import com.eramaya.eravett.model.entity.Profile;
import com.eramaya.eravett.model.entity.User;
import com.eramaya.eravett.service.generic.AddressGenericService;
import com.eramaya.eravett.service.generic.ProfileGenericService;
import com.eramaya.eravett.service.generic.UserGenericService;
import com.eramaya.eravett.web.form.UserForm;

@Service
public class RegistrationService {

	@Autowired
	UserGenericService userGenericService;
	@Autowired
	ProfileGenericService profileGenericService;
	@Autowired
	AddressGenericService addressGenericService;
	
	@Transactional
	public void register(UserForm form){
		User user=new User();
		user.setUsername(form.getUsername());
		user.setPassword(form.getPassword());
		user.setActiveFlag("Y");
		user.setRegistrationDate(new Date());
		userGenericService.save(user);
		
		Profile profile =new Profile();
		profile.setName(form.getName());
		profile.setIdType(form.getIdType());
		profile.setIdNumber(form.getIdNumber());
		profile.setGender(form.getGender());
		profile.setDob(form.getDob());
		profile.setPob(form.getPob());
		profile.setRaceId(form.getRaceId());
		profile.setPhoneNo(form.getPhoneNo());
		profile.setEmail(form.getEmail());
		profileGenericService.save(profile);
		
		Address pAdd=new Address();
		pAdd.setAddress1(form.getPermanentAddress1());
		pAdd.setAddress2(form.getPermanentAddress2());
		pAdd.setAddress3(form.getPermanentAddress3());
		pAdd.setCity(form.getPermanentCity());
		pAdd.setPostcode(form.getPermanentPostcode());
		pAdd.setCountryId(form.getPermanentCountryId());
		pAdd.setStateId(form.getPermanentStateId());
		addressGenericService.save(pAdd);
		
	}
}
