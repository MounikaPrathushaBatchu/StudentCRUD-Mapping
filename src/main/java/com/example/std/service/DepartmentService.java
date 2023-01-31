package com.example.std.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.std.model.Department;
@Service
public interface DepartmentService {
	
	Long savedepartment(Department department);
	
	List<Department> getAllDepartments();
	
	Department getOneDepartment(Long id);
	
	void deleteDepartment(Long id);

	List<Department> getAllDepartmentsinPage(int number);

}
