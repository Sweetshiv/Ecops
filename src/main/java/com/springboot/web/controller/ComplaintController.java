package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.entity.Complaint;
import com.springboot.web.repository.ComplaintRepository;
import com.springboot.web.service.CompService;
import com.springboot.web.service.ComplaintService;

import java.util.List;

import javax.servlet.http.HttpSession;

@Controller

public class ComplaintController {
	@Autowired

	ComplaintService complaintService;

	@GetMapping("/home")
	public String home() {
		return "index";

	}

	@GetMapping("/status")
	public String status() {
		return "complaintStatusDetails";

	}

	public ComplaintController(ComplaintService complaintService) {

		this.complaintService = complaintService;
	}

	@GetMapping("/complaints")
	public String listComplaints(Model model) {
		List<Complaint> Complaint = complaintService.getComplaintList();

		model.addAttribute("complaint", Complaint);
		return "complaints";
	}

	@GetMapping("/complaints/new")
	public String createComplaintForm(Model model) {

		Complaint complaint = new Complaint();
		model.addAttribute("complaint", complaint);
		return "create_complaint";

	}

	@PostMapping("/complaints")
	public String saveComplaint(@ModelAttribute("complaint") Complaint complaint) {
		System.out.println(complaint);
		complaintService.saveComplaint(complaint);
		return "redirect:/complaints";
	}

	@GetMapping("/complaints/edit/{id}")
	public String editComplaint(@PathVariable int id, Model m) {
		Complaint c = complaintService.getComplaintById(id);
		m.addAttribute("complaint", c);
		return "edit_complaint";
	}

	// update complaint actual

	@PostMapping("/complaints/{id}")
	public String updateComplaint(@ModelAttribute Complaint c, HttpSession session) {

		complaintService.saveComplaint(c);
		session.setAttribute("msg", "complaint is updated sucessfully.....");
		return "redirect:/complaints";

	}

	@GetMapping("/complaints/{id}")
	public String deleteComplaint(@PathVariable int id) {
		complaintService.deleteComplaint(id);

		return "redirect:/complaints";
	}

}
