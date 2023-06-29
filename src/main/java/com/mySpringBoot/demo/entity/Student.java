package com.mySpringBoot.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_name", nullable = false)
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email", nullable = false)
	private String email;
	
	public Student() {
		
	}

	/**
	 * @param firstname
	 * @param lastname
	 * @param email
	 */
	public Student(String firstname, String lastname, String email) {
		super();
		this.firstName = firstname;
		this.lastName = lastname;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}

