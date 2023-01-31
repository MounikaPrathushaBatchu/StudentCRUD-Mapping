package com.example.std.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.std.model.Student;
@Service
public interface StudentService {
	
	Long saveStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getOneStudent(Long id);
	
	Student getOneStudent(String name);
	
	void deleteStudent(Long id);

	List<Student> getAllStudentsinPage(int number);

}
