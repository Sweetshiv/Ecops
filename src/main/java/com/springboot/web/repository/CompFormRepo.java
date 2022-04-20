package com.springboot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.entity.ComplaintForm;

@Repository

public interface CompFormRepo extends JpaRepository<ComplaintForm, Integer>{

}
