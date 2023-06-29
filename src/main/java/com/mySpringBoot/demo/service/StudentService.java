package com.mySpringBoot.demo.service;

import java.util.List;

import com.mySpringBoot.demo.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

}
