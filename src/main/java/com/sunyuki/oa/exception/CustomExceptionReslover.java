package com.sunyuki.oa.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/**
 * 自定义异常解析类
 */
@Order(value=1)
public class CustomExceptionReslover implements HandlerExceptionResolver{

	public CustomExceptionReslover() {
	}

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		CustomException customException=null;
		if(ex instanceof CustomException){
			customException=(CustomException) ex;
		}else{
			customException=new CustomException("未知错误");
		}
		
		ModelAndView modelAndView=new ModelAndView();
				
		modelAndView.addObject("message", customException.getMessage());
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
