package com.topcheer.restful.myfirstrestfulapp.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.topcheer.restful.framework.controller.BaseService;

@Controller
@RequestMapping("/restful")
public class MyFirstRestfulService extends BaseService {
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object HellowWord() {	
		return super.selectListObject("topcheer2.getUserList", null);
	}
}
