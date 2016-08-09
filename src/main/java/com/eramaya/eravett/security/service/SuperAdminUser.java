package com.eramaya.eravett.security.service;

import java.util.List;

import lombok.Data;

@Data
public class SuperAdminUser {
	
	private String username;
	private String password;
	private String name;
	private Integer deptId;
	private String deptDisplay;
	private Integer campusCode;
	private String campusDisplay;
	private boolean remindLocation = false;
	private List<String> authorities;

}
