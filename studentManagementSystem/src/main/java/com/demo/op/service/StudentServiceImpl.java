package com.demo.op.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.op.model.Student;
import com.demo.op.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
public StudentRepository studentRepository;

@Override
public List<Student> getAllStudents() {
	
	return studentRepository.findAll();
}
@Override
public void saveStudent(Student student) 
	{
		this.studentRepository.save(student);
	}
@Override
public Student getStudentById(Integer id) {
	Optional<Student> optional=studentRepository.findById(id);
		Student student=null;
		if(optional.isPresent())
		{
			student=optional.get();
		}
		else
		{
			throw new RuntimeException("Student not found ::"+id);
		}
		return student;
	}
@Override
public void deleteStudentById(Integer id) {
	this.studentRepository.deleteById(id);
	}
}
