package com.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.web.entity.Complaint;
import com.springboot.web.repository.ComplaintRepository;

@SpringBootApplication
public class EcopsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EcopsApplication.class, args);
	}
@Autowired
private ComplaintRepository complaintRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
	}

}
