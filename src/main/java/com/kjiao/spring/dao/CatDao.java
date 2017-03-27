package com.kjiao.spring.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kjiao.spring.bean.Cat;

@Repository
public class CatDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Cat selectByCatName(String name){
		String sql = "select * from cat where cat_name=?";
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<Cat>(Cat.class);
		Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{name}, rowMapper);
		return cat;
	}
}
