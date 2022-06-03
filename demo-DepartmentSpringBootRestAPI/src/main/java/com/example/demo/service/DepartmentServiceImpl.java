package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public abstract class DepartmentServiceImpl implements DepartmentService{
@Autowired
	DepartmentRepository departmentRepo;
	public Department saveDepartment(Department department) {
			return departmentRepo.save(department);
	}
	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}
	@Override
	public void deleteDepartmentById(Long did) {
		// TODO Auto-generated method stub
		 departmentRepo.deleteById(did);
	}

}




















/*
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
     DepartmentRepository
	@Override
	public Department saveDepartment(Department department) {
		return departmentrepo.save(department);
	}
}
*/