package com.sunyuki.oa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="item")
public class UserController {

	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return null;
	}

	public long getLastModified(HttpServletRequest request, Object handler) {
		
		return 0;
	}
	
	@RequestMapping(value="lsit",method={RequestMethod.GET,RequestMethod.POST})
	public void list(HttpServletRequest arg0, HttpServletResponse response,Integer id) throws ServletException, IOException {
		response.getWriter().print("1234");
	}
	
}
