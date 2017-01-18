package com.sunyuki.oa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sunyuki.oa.domain.UserCustom;

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
	
	//@Validated UserCustom userCustom,BindingResult bindingResult
	//这两个必须成对出现,顺序不可更改
	@RequestMapping(value="lsit",method={RequestMethod.GET,RequestMethod.POST})
	public String list(Model model,HttpServletRequest arg0, HttpServletResponse response,Integer id
			,@Validated UserCustom userCustom,BindingResult bindingResult) throws ServletException, IOException {
		if(bindingResult.hasErrors()){
			List<ObjectError> errors = bindingResult.getAllErrors();
			for(ObjectError error:errors){
				error.getDefaultMessage();
			}
			model.addAttribute("allError", errors);
			return "";
		}
		response.getWriter().print("1234");
		return "";
	}
	
}
