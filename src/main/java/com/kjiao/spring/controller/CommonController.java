package com.kjiao.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@RequestMapping("/info")
	public String info() {
		return "spring boot info";
	}
}
