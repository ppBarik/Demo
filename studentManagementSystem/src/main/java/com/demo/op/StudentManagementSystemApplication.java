package com.demo.op;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.op.model.Student;
import com.demo.op.model.StudentProfile;
import com.demo.op.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	public StudentRepository studentRepository;
	@Autowired
	public StudentProfile studentProfile;
	@Override
	public void run(String... args) throws Exception {
		Student student=new Student();
		student.setName("Avinash");
		student.setBranch("cse");
		student.setAddress("hydrabad");
		
		StudentProfile studentProfile=new StudentProfile();
		studentProfile.setPhoneNo("9935687809");
		studentProfile.setDateOfBirth(LocalDate.of(2002, 07, 21));
		studentProfile.setAddress("karnatak");
		
		student.setStudentProfile(studentProfile);
		studentProfile.setStudent(student);
		
		studentRepository.save(student);
	}

}
