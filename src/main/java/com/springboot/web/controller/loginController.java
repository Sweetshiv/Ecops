package com.springboot.web.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.entity.User;
import com.springboot.web.repository.UserRepository;



@Controller
@SessionAttributes
public class loginController {
	@Autowired
	private UserRepository repo;
	
	@GetMapping(value = "/login") 
	public String login() {
		
		return "login";
		
	}
	@PostMapping("/login")
	public String login1(String email,String password, HttpSession session) {
		
		System.out.println(email);
		User u1=repo.findByEmailAndPassword(email,password);
		if(u1 !=null)
		{
		
		session.setAttribute("name", u1.getName());
		
		return "home";
		
		}
		
		else
		
		return "login";
		
	}
	@GetMapping("/logout")
	public String logout(HttpSession  session) {
		session.removeValue("name");
		return "home";
	}
	


}
