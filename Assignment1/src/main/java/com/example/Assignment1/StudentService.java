package com.example.Assignment1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	public StudentRepository srepo;
	
	public Iterable<Student> getAllStudent(){
		return srepo.findAll();
	}
	
	public Optional<Student> getStudent(Integer rollno){
		return srepo.findById(rollno);
	}	
	
	public Student getStudent(String Student_Name){
		return srepo.findByName(Student_Name);
	}
	
	public Student findByMobile(String Mobile_Number) {
		return srepo.findByMobile(Mobile_Number);
	}
}

