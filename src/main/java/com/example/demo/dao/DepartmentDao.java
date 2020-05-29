package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository
public interface DepartmentDao {
	public List<Department> search();

	public Department searchById(int id);

	public int add(Department dep);

	public int update(Department dep);

	public int delete(int id);

}
