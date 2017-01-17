package com.sunyuki.oa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return null;
	}

	public long getLastModified(HttpServletRequest request, Object handler) {
		
		return 0;
	}
	
	@RequestMapping(name="items")
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("1234");
	}
	
}
