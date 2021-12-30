package com.demo.op.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Branch")
	private String branch;
	@Column(name = "Address") 
	private String address;
	@OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	@JoinColumn(name = "sp_id")
	private StudentProfile studentProfile;
	
	public Student() {	
	}
	public Student(String name, String branch, String address, StudentProfile studentProfile) {
		super();
		this.name = name;
		this.branch = branch;
		this.address = address;
		this.studentProfile = studentProfile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentProfile getStudentProfile() {
		return studentProfile;
	}
	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}
	
	
}
