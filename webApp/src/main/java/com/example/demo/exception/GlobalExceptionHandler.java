package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message",e.getMessage());
		modelAndView.setViewName("error");
		return modelAndView;
		
	}

}
