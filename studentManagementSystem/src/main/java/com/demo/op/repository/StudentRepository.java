package com.demo.op.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.op.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
