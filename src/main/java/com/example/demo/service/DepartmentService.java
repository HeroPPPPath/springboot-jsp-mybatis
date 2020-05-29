package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository
public interface DepartmentService {
	public List<Department> search();

	public Department searchById(int id);

	public boolean add(Department dep);

	public boolean update(Department dep);

	public boolean delete(int id);
}
