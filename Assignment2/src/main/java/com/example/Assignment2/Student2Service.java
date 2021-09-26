package com.example.Assignment2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment2.dto.Student2;

@Service
public class Student2Service {

	@Autowired
	public Student2Repo srepo;
	
	public Iterable<Student2> getAllStudent(){
		return srepo.findAll();
	}
	
	public Optional<Student2> getStudent(Integer Rollno){
		return srepo.findById(Rollno);
	}	
	
	public Student2 getRollSem(Integer Rollno, Integer SemesterNo) {
		return srepo.getRollSem(Rollno, SemesterNo);
	}
}