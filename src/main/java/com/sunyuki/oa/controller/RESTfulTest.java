package com.sunyuki.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunyuki.oa.domain.UserCustom;

@Controller
@RequestMapping(value = "/user")
public class RESTfulTest {

	// json请求 json返回
	@RequestMapping(value = "/item/{id}")
	public @ResponseBody UserCustom user(@PathVariable("id") Integer id) {
		

		return null;
	}


}
