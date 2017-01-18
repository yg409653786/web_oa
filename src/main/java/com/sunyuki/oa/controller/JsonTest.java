package com.sunyuki.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunyuki.oa.domain.UserCustom;

@Controller
@RequestMapping(value = "json")
public class JsonTest {

	// json请求 json返回
	@RequestMapping(value = "jsonRequest")
	public @ResponseBody UserCustom jsonRequest(@RequestBody UserCustom userCustom) {

		return userCustom;
	}

	// json请求 json返回
	@RequestMapping(value = "keyvalueRequest")
	public @ResponseBody UserCustom keyvalueRequest(UserCustom userCustom) {

		return userCustom;
	}

}
