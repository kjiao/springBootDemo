package com.kjiao.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.kjiao.spring.bean.Cat;

public interface Cat2Repository extends Repository<Cat, Integer>{

	Cat findByCatName(String name);
	
	/**
	 * JPQL query
	 * @param name
	 * @return
	 */
	@Query("from Cat where catName=:name")
	Cat findMyCat(@Param("name")String name);
}
