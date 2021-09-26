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
	
	/*public String updateStudent(Integer Id, Student student) {
		try {
			student.setId(Id);
			srepo.save(student);
			return "Updated";
		}catch(Exception e) {
			return "Failed";
		}
	}*/
	
	/*public Optional<Student> exById(Integer rollno) {
		return srepo.exById(rollno);
	}*/
	
	/*public String addStudent(Student s) {
	
	try {
		srepo.save(s);
		return "saved";
	} catch(Exception e) {
		return "failed";
	}
}*/

}

