package com.example.demo.service;

/*
import java.util.List;

import com.edu.demo.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	void deleteDepartmentById(Long did);

	

	
}
*/
import java.util.List;

import com.edu.demo.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<com.example.demo.entity.Department> fetchDepartmentList();

	void deleteDepartmentById(Long did);

	

	
}
