package com.kjiao.spring.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kjiao.spring.bean.Cat;
import com.kjiao.spring.dao.CatDao;
import com.kjiao.spring.repository.Cat2Repository;
import com.kjiao.spring.repository.CatRepository;

@Service
public class CatService {

	@Resource
	private CatRepository catRepository;
	@Resource
	private Cat2Repository cat2Repository;
	@Resource
	private CatDao catDao;
	@Transactional
	public void save(Cat cat){
		catRepository.save(cat);
	}
	@Transactional
	public void delete(int id){
		catRepository.delete(id);
	}
	
	public Iterable<Cat> getAll(){
		return catRepository.findAll();
	}
	
	public Cat findByName(String catName){
		return cat2Repository.findByCatName(catName);
	}
	
	public Cat findMyCat(String name){
		return cat2Repository.findMyCat(name);
	}
	
	public Cat selectByCatName(String name) {
		return catDao.selectByCatName(name);
	}
}
