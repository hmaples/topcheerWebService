package com.topcheer.restful.myfirstrestfulapp.dto;

import com.topcheer.restful.framework.dto.BaseDto;

public class User extends BaseDto{

	private String user_name;
	private String pass_word;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String userName) {
		user_name = userName;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String passWord) {
		pass_word = passWord;
	}
	
}
