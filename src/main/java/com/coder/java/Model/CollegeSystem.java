package com.coder.java.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CollegeSystem {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int rollno;
private String name;
private int age;
private String gender;
private int marks;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

@Override
public String toString()
{
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", gender= "+ gender
			+", marks=" + marks+"]";
}



	
}
