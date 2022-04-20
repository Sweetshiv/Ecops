package com.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.ComplaintForm;
import com.springboot.web.repository.CompFormRepo;


@Service
public class CompService {
	
	@Autowired
	 CompFormRepo repo;

	 public void addComp(ComplaintForm c) {
		 
		 repo.save(c);
}
	 
	 public List<ComplaintForm> getAllComp(){
		 
		return repo.findAll();
		
	 }
}