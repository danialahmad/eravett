package com.eramaya.eravett.security.service;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.eramaya.eravett.model.entity.Profile;
import com.eramaya.eravett.model.entity.User;
import com.eramaya.eravett.service.generic.ProfileGenericService;
import com.eramaya.eravett.service.generic.UserGenericService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("authenticateUserService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	private SuperAdminUser superAdminUser;
	private UserGenericService userGenericService;
	private ProfileGenericService profileGenericService;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException, DataAccessException {
	
		log.info("SuperAdmin user " + superAdminUser.getUsername());
		if(username.equals(superAdminUser.getUsername())){
			final UserDetail userDetail = new UserDetail(username, superAdminUser.getPassword(), new ArrayList<GrantedAuthority>(),
					superAdminUser.getUsername(), superAdminUser.getName(), true);
			return userDetail;
		} else {
			User user =userGenericService.findOne(username);
			Profile profile=profileGenericService.getRepository().findByUserUsername(username);
			if (user == null) {
				// throw new BadCredentialsException("BadCredential");
				throw new UsernameNotFoundException(username);
			}
			/**
			 * final List<GrantedAuthority> authorities = new ArrayList
			 * <GrantedAuthority>(); final List<UserRole> list =
			 * userRoleRepository.findByUsername(username); for (final UserRole
			 * userRole : list) { final String rolename =
			 * userRole.getRoles().getName(); authorities.add(new
			 * GrantedAuthorityImpl(rolename)); }
			 * 
			 * String displayName = ""; if(user.getCodeCategoryUser().getId() ==
			 * ConstantsService.CATEGORY_USER_CALON){ displayName =
			 * user.getEpCalon().getName(); } else{ displayName =
			 * user.getUserProfile().getName(); }
			 **/
			boolean active = false;
			if(StringUtils.equals(user.getActiveFlag(), "Y")) active = true;
			final UserDetail userDetail = new UserDetail(username, user.getPassword(), new ArrayList<GrantedAuthority>(),
					user.getUsername(), profile.getName(),profile.getFileBlob().getId(),active);
			return userDetail;
		}
		
	}

	public SuperAdminUser getSuperAdminUser() {
		return superAdminUser;
	}

	public void setSuperAdminUser(SuperAdminUser superAdminUser) {
		this.superAdminUser = superAdminUser;
	}

}
