package com.coder.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.coder.java.Model.CollegeSystem;


//@Repository("GenderRepository")
public interface GenderRepository extends JpaRepository<CollegeSystem, String> {
CollegeSystem findAllByGender(String gender);
}


