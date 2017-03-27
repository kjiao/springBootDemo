package com.kjiao.spring.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1. create GlobalDefaultExceptionHandler
 * 2. add @ControllerAdvice on this class
 * 3. create a method in this class
 * 4. add @ExceptionHandler to catch exception message
 * 5. if return view, the value return of this method is ModelAndView
 * 6. if return String or json, we need add @ResponseBody annotation.
 * 
 * @author kjiao
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest req, Exception e){
		// return string
		return "sorry, server is busy..";
	}
}
