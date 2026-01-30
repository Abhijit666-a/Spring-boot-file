package com.example.Student;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class StudentController {
	public StudentService ss;
	public StudentController(StudentService ss) {
		this.ss = ss;
	}
	@GetMapping("/hello")
	public List<Student> hello() {
		
		return ss.getstudent();
	}
	
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student a) {
		
		return ss.addstudent(a);
	}
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@PathVariable long id, @RequestBody Student s){
		return ss.updatestudent(id, s);
	}
}
