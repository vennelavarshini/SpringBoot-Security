package com.example.springsecurty2.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springsecurty2.entiy.College;
import com.example.springsecurty2.repostory.CollegeRepository;


@Service
public class CollegeService {
	@Autowired
	private CollegeRepository collegerpositry;
	
	
	
	public List<College>getAll(){
		return collegerpositry.findAll();
	}
	public College getById(Long id) {
	    return collegerpositry.findById(id).orElse(null);
	}
}
