package com.demo.op.service;

import java.util.List;

import com.demo.op.model.Student;


public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(Integer id);
	void deleteStudentById(Integer id);
}
