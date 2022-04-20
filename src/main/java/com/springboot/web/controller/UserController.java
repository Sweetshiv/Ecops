package com.springboot.web.controller;



import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.web.entity.User;
import com.springboot.web.repository.UserRepository;




@Controller
public class UserController {

	@Autowired
	private UserRepository repo;

	/*
	 * @GetMapping("/home") public String home(Model model) {
	 * model.addAttribute("title","Home - eCops"); return "index";
	 * 
	 * }
	 */

	@GetMapping("/registration")
	public String registration(User user , Model model) {
		model.addAttribute("title","Home - eCops");
		return "registration";
	}

	
	// handler for Registration
	@PostMapping("/register")
	public String userRegistration(@Valid User user, BindingResult result,  
			 Model model, HttpSession session) {
		
		System.out.println(user);
			
			if(result.hasErrors()) {
				System.out.println("Error "+ result.toString());
				return "registration";
			}

			System.out.println(user);
			repo.save(user);
		//	session.setAttribute("message", new Message("User Register Sucessfully, Please login", "alert-success", null, null, null, null));
		//	session.setAttribute("message", new Message("User Register Sucessfully, Please login", "alert-success", null, null, null, null));
			return "redirect:/login";
			
		}
}