package com.eramaya.eravett.security.service;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class UserDetail extends User {
	
	private String id;
	private String displayName;
	private Integer photoId;

	
	public UserDetail(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	public UserDetail(final String username, final String password,
			final Collection<? extends GrantedAuthority> authorities, final String id,
			final String displayName, final Boolean active) {
		super(username, password, active, true, true, true, authorities);
		this.id = id;
		this.displayName = displayName;
	}
	
	public UserDetail(final String username, final String password,
			final Collection<? extends GrantedAuthority> authorities, final String id,
			final String displayName, Integer photoId, final Boolean active) {
		super(username, password, active, true, true, true, authorities);
		this.id = id;
		this.displayName = displayName;
		this.photoId=photoId;
	}

}
