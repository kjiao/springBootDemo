package com.kjiao.spring.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kjiao.spring.Demo;

@RestController
public class HelloworldController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	/**
	 * spring boot read json format data by jackson 
	 * @return
	 */
	@RequestMapping("/demo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("Tom");
		demo.setCreateTime(new Date());
		return demo;
	}

}
