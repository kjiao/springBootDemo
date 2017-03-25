package com.kjiao.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.kjiao.spring.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer> {

}
