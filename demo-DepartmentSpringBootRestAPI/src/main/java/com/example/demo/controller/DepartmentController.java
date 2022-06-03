package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.demo.entity.Department;
import com.edu.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	@PostMapping("/departments/")
	public Department saveDepatDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	//getRecords
	@GetMapping("/departments/")
	public List<Department> fetchDepartmetList(){
		
		return departmentService.fetchDepartmentList();
	}
	
	//delete 
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long did) {
		departmentService.deleteDepartmentById(did);
		return "Department is deleted";
		
	}
	
}
























/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;

@RestController
public class DepartmentController {
 @Autowired
	DepartmentService departmentService;
 @PostMapping("/department")
	public Department departmentSave(@RequestBody Department department) {
     return departmentService.saveDepartment(department);
 }
 //getRecord
 @GetMapping("/departments/")
 public List<Department> fetch
 
 }
}
*/