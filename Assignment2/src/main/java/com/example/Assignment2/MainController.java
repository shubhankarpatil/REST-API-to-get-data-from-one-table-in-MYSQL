package com.example.Assignment2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Assignment2.dto.Student2;

@Controller
@RequestMapping(path="/student2")
public class MainController {
	
	@Autowired
	public Student2Service stuserv;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Student2> getAllStudent() {
		return stuserv.getAllStudent();
	}
	
	@GetMapping(path="/{rollno}")
	public @ResponseBody Optional<Student2> getStudentById(@PathVariable(name = "Rollno") Integer Rollno) {
		return stuserv.getStudent(Rollno);
	}
	
	@GetMapping(path="/{Rollno}/{SemesterNo}")
	public @ResponseBody Student2 getRollSem(@Param("Rollno") Integer Rollno, @Param("SemesterNo") Integer SemesterNo) {
		return stuserv.getRollSem(Rollno, SemesterNo);
	}		
}