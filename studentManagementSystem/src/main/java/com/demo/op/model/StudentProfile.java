package com.demo.op.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_profile")
public class StudentProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String phoneNo;
	private String address;
	private LocalDate dateOfBirth;
	
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL ,mappedBy ="studentProfile" )
	private Student student;
	public StudentProfile(String phoneNo, String address, LocalDate dateOfBirth) {
		super();
		this.phoneNo = phoneNo;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	public StudentProfile() {
	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
