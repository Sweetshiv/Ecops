package com.springboot.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springboot.web.entity.ComplaintForm;
import com.springboot.web.service.CompService;
import com.springboot.web.service.ComplaintService;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class usercontro {
	@Autowired
	private CompService service;

	
	/*
	 * @GetMapping("/home") public String home() { return "index";
	 * 
	 * }
	 */
	 
	
	
	/*
	 * @GetMapping("/addComp") public String addComplaint(Model m) {
	 * List<ComplaintForm> list=service.getAllComp();
	 * 
	 * 
	 * 
	 * // add to the spring model m.addAttribute("comp", list);
	 * 
	 * // m.addAttribute("comp",comp);
	 * 
	 * return "/complaints";
	 * 
	 * }
	 */
	
	@GetMapping("/CompForm")
	public String ComplaintForm()
	{
		return "complaintform";
		
	}
	
	/*
	 * @PostMapping("/register") public String
	 * ComplaintForm1(@ModelAttribute("comp") ComplaintForm c ) {
	 * 
	 * //ComplaintForm c=new ComplaintForm(); // m.addAttribute("comp",c);
	 * System.out.println(c);
	 * 
	 * 
	 * service.addComp(c);
	 * 
	 * 
	 * return "redirect:/";
	 * 
	 * }
	 */
	
	
}
