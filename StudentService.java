package com.example.Student;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public StudentRepository repo;

	public StudentService(StudentRepository repo) {
		this.repo = repo;
	}

	public List<Student> getstudent() {

		return repo.findAll();

	}

	public Student addstudent(Student s) {

		return repo.save(s);

	}

	public Student updatestudent(long id,Student s) {
		Student stud = repo.findById(id).orElse(null);

		if (stud != null) {
			stud.setName(s.getName());
			stud.setAge(s.getAge());
		}
		return repo.save(stud);
		
	}

}