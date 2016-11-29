package com.topcheer.restful.testapp.service;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.topcheer.restful.framework.controller.BaseService;
import com.topcheer.restful.testapp.dto.User;

@Controller
@RequestMapping("/users")
public class GetService extends BaseService {

	
	public List<User> list = null;

	/**
	 * user路径下默认显示用户列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		list = super.selectListObject("topcheer.getUserList", null);
		return list.get(0).getUser_name() + list.get(0).getPass_word();
	}

	/**
	 * 新增保存用户
	 * 
	 * @param user
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/post/{user_name}/{pass_word}", method = RequestMethod.POST)
	@ResponseBody
	public String addUser(@PathVariable("user_name") String user_name,
			@PathVariable("pass_word") String pass_word) {
		User user = new User();
		user.setUser_name(user_name);
		user.setPass_word(pass_word);
		super.insert("topcheer.insertUser", user);
		
		return "/hello";
	}

	/**
	 * 查看用户详细信息
	 * 
	 * @param id
	 * @return ModelAndView
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/get/{user_name}")
	public String viewUser(@PathVariable("user_name") String user_name) {
		User user = new User();
		user.setUser_name(user_name);
		user =  super.selectObject("topcheer.queryUser", user);
		return "/hello";
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{user_name}")
	public String deleteUser(@PathVariable("user_name") String user_name) {
		User user = new User();
		user.setUser_name(user_name);
		super.del("topcheer.delUser", user);
		return "success";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, value = "/put/{user_name}/{pass_word}")
	public String putUser(@PathVariable("user_name") String user_name,
			@PathVariable("pass_word") String pass_word) {
		User user = new User();
		user.setUser_name(user_name);
		user.setPass_word(pass_word);
		super.update("topcheer.updateUser", user);
		return "success";
	}

}