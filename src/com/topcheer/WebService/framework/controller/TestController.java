package com.topcheer.WebService.framework.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/products")
public class TestController {

	@RequestMapping(value="/list",method=RequestMethod.GET)
	@ResponseBody
	public String getProducts(HttpServletRequest request,HttpServletResponse response){
		request.setAttribute("name", "helloWord");
		System.out.println(request.getSession().getServletContext().getRealPath("/"));;
        return "products/list";
	}
}
