package com.mySpringBoot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mySpringBoot.demo.entity.Student;
import com.mySpringBoot.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student std1 = new Student("Mr. A", "123", "A.123@gmail.com");
//		studentRepository.save(std1);
//		Student std2 = new Student("Mr. B", "456", "B.456@gmail.com");
//		studentRepository.save(std2);
//		Student std3 = new Student("Mr. C", "789", "C.789@gmail.com");
//		studentRepository.save(std3);
		
				
	}
	

}
