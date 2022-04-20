package com.springboot.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.Complaint;
import com.springboot.web.repository.ComplaintRepository;
import com.springboot.web.service.ComplaintService;



/*
 * @Service public class ComplaintServiceImpl implements ComplaintService {
 * 
 * private ComplaintRepository complaintRepository;
 * 
 * 
 * @Autowired public ComplaintServiceImpl(ComplaintRepository
 * complaintRepository) { super(); this.complaintRepository =
 * complaintRepository; }
 * 
 * 
 * 
 * @Override public List<Complaint> getAllComplaints() { return
 * complaintRepository.findAll(); }
 * 
 * 
 * 
 * @Override public Complaint saveComplaint(Complaint complaint) { return
 * complaintRepository.save(complaint); }
 * 
 * 
 * 
 * @Override public Complaint getComplaintById(Long complaintId) { return
 * complaintRepository.findById(complaintId).get(); }
 * 
 * 
 * 
 * @Override public Complaint updateComplaint(Complaint complaint) { return
 * complaintRepository.save(complaint); }
 * 
 * 
 * 
 * @Override public void deleteComplaint(Long complaintId) {
 * complaintRepository.deleteById(complaintId); }
 * 
 * 
 * 
 * @Override public List<Complaint> getComplaintList() { // TODO Auto-generated
 * method stub return null; }
 * 
 * 
 * 
 * }
 */