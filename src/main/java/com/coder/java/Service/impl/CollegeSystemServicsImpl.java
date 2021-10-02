package com.coder.java.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coder.java.Model.CollegeSystem;
import com.coder.java.Repository.CollegeSystemRepository;
import com.coder.java.Service.CollegeSystemService;

@Service
public class CollegeSystemServicsImpl implements CollegeSystemService{
	@Autowired
	private CollegeSystemRepository CollegeSystemRepository;
	
	
	@Override
	public CollegeSystem createCollegeSystem(CollegeSystem collegeSystem)
	{
		 return CollegeSystemRepository.save(collegeSystem);
		}

	@Override
	public CollegeSystem getCollegeSystem(int rollno) {
		Optional<CollegeSystem> optional = CollegeSystemRepository.findById(rollno);
		CollegeSystem collegeSystem = optional.get();
		return collegeSystem;
	}

	@Override
	public List<CollegeSystem> getCollegeSystems() {
		return (List<CollegeSystem>)CollegeSystemRepository.findAll();
	}

	@Override
	public boolean isCollegeSystemExist(int rollno) {
		return CollegeSystemRepository.existsById(rollno);
	}
	
	@Override
	public List<CollegeSystem> findCollegeSystemByGender(String gender){
		return (List<CollegeSystem>) CollegeSystemRepository.findCollegeSystemByGender(gender);
	}

}
