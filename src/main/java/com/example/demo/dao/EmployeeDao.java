package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
//Mybatis
public interface EmployeeDao {
	public List<Employee> search();

	public Employee searchById(int id);

	public int add(Employee emp);

	public int update(Employee emp);

	public int delete(int id);

	int updateByDep(int depId);
}
