package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

@SuppressWarnings("unchecked")
Department save(Department department);
	List<Department> findAll();
	void deleteById(Long did);
	
}





















/*
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;
@Repository
public interface DepartmentRepository  extends JpaRepository<Department,Long>{

}
*/