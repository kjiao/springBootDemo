package com.kjiao.spring.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kjiao.spring.bean.Cat;
import com.kjiao.spring.service.CatService;

@RestController
@RequestMapping("/cat")
public class CatController {
	
	@Resource
	private CatService service;
	
	@RequestMapping("/save")
	public String save(){
		Cat cat = new Cat();
		cat.setCatAge(5);
		cat.setCatName("jerry");
		service.save(cat);
		return "save";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		service.delete(1);
		return "delete";
	}
	
	@RequestMapping("/all")
	public Iterable<Cat> getAll() {
		return service.getAll();
	}
 	
}
