package com.mySpringBoot.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mySpringBoot.demo.entity.Student;
import com.mySpringBoot.demo.repository.StudentRepository;
import com.mySpringBoot.demo.service.StudentService;

@Service
public class SteudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	public SteudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override 
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

}
