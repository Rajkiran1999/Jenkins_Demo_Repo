package com.coder.java.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.java.Model.CollegeSystem;  
public interface CollegeSystemRepository extends JpaRepository<CollegeSystem, Integer> {

	List<CollegeSystem> findCollegeSystemByGender(String gender);
}


