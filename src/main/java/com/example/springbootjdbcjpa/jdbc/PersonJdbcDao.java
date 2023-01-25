package com.example.springbootjdbcjpa.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springbootjdbcjpa.entity.Person;

@Repository
public class PersonJdbcDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    @SuppressWarnings("unchecked")
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", 
                    new BeanPropertyRowMapper<Person>(Person.class));   
    }
}
