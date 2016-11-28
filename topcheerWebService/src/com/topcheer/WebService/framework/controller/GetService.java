package com.topcheer.WebService.framework.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.topcheer.WebService.framework.dto.User;
import com.topcheer.WebService.framework.service.UserService;

@Controller
@RequestMapping("/users")
public class GetService {

	@Autowired
	private UserService userService;

	public List<User> list = null;

	/**
	 * user路径下默认显示用户列表
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		list = userService.getUserList();
		return "/hello";
	}


	/**
	 * 新增保存用户
	 * 
	 * @param user
	 * @return ModelAndView
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String addUser(User user) {
		userService.insertUser(user);
		return "/hello";
	}

	/**
	 * 查看用户详细信息
	 * 
	 * @param id
	 * @return ModelAndView
	 */
	@RequestMapping(method = RequestMethod.GET, value = "{user_name}")
	public String viewUser(@PathVariable("user_name") String user_name) {
		User user = new User();
		user.setUser_name(user_name);
		user = userService.getUserInfo(user);
		return "/hello";
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.DELETE, value = "{user_name}")
	public String deleteUser(@PathVariable("user_name") String user_name) {
		User user = new User();
		user.setUser_name(user_name);
		userService.delUser(user);
		return "success";
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT,value = "{user_name}")
	public String putUser(@PathVariable("user_name") String user_name){
		User user = new User();
		user.setUser_name(user_name);
		userService.updateUser(user);
		return "/hello";
	}

}
