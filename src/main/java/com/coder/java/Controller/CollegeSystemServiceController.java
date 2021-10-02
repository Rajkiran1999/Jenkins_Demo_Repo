package com.coder.java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coder.java.Exception.CollegeSystemException;
import com.coder.java.Exception.MarksException;
import com.coder.java.Model.CollegeSystem;
import com.coder.java.Service.CollegeSystemService;

@RestController
public class CollegeSystemServiceController {

	@Autowired
	private CollegeSystemService CollegeSystemService;

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ResponseEntity<Object> createCollegeSystem(@RequestBody CollegeSystem collegeSystem)
	{
		if(collegeSystem.getMarks()>400) {
		collegeSystem = CollegeSystemService.createCollegeSystem(collegeSystem);
		return new ResponseEntity<>("Student is created successfully with id = " +collegeSystem.getRollno(), HttpStatus.CREATED);
		}
		else {
			throw new MarksException();
		}
	}

	
	@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> getCollegeSystem(@PathVariable("rollno") int rollno)
	{
		boolean isCollegeSystemExist = CollegeSystemService.isCollegeSystemExist(rollno);
		if (isCollegeSystemExist)
		{
			CollegeSystem CollegeSystem = CollegeSystemService.getCollegeSystem(rollno);
			return new ResponseEntity<>(CollegeSystem, HttpStatus.OK);
		}
		else
		{
			throw new CollegeSystemException();
		}

	}

	@RequestMapping(value = "/getAllFemaleStudents/{gender}", method = RequestMethod.GET)
	public ResponseEntity<Object> getCollegeSystems(@PathVariable("gender") String gender)
	{
		List<CollegeSystem> CollegeSystemList = CollegeSystemService.findCollegeSystemByGender(gender);
		return new ResponseEntity<>(CollegeSystemList, HttpStatus.OK);
	}

	
}
