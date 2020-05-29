package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeService {
	List<Employee> search();

	Employee searchById(int id);

	boolean add(Employee emp);

	boolean update(Employee emp);

	boolean delete(int id);

	boolean updateByDep(int depId);

}
