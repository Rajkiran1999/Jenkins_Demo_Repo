package com.coder.java.Service;

import java.util.List;
import com.coder.java.Model.CollegeSystem;


public interface CollegeSystemService {

public abstract CollegeSystem createCollegeSystem(CollegeSystem collegeSystem);

public abstract CollegeSystem getCollegeSystem(int rollno);
	
public abstract List<CollegeSystem> getCollegeSystems();
	
public abstract List<CollegeSystem> findCollegeSystemByGender(String gender);
	
public abstract boolean isCollegeSystemExist(int rollno);
}
