package com.example.Assignment1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/student")
public class MainController {
	
	@Autowired
	public StudentService studentService;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@GetMapping(path="/{rollno}")
	public @ResponseBody Optional<Student> getStudentById(@PathVariable(name = "rollno") Integer rollno) {
		return studentService.getStudent(rollno);
	}
	
	@GetMapping(path="/Name/{Student_Name}")
	public @ResponseBody Student findByName(@PathVariable(name = "Student_Name") String Student_Name){
		return studentService.getStudent(Student_Name);
	}
	
	@GetMapping(path="/Mobile/{Mobile_Number}")
	public @ResponseBody Student findByMobile(@PathVariable(name = "Mobile_Number") String Mobile_Number) {
		return studentService.findByMobile(Mobile_Number);
	}
	
	/*@PostMapping(path="/update/{id}")
	public @ResponseBody String updateStudent(@PathVariable(name = "id") Integer id, @RequestBody Student student) {
		return studentService.updateStudent(id,student);
	}*/
	
	/*@PostMapping(path="/add")
	public @ResponseBody String addNewStudent (@RequestBody Student s) {
			return studentService.addStudent(s);
	}*/
	
	/*@GetMapping(path="/ex/{rollno}")
	public @ResponseBody Optional<Student> exById(@PathVariable(name = "rollno") Integer rollno) {
		return studentService.exById(rollno);
	}*/
}	
