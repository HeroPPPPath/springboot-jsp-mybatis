package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public List<Employee> search() {
		List<Employee> list = empDao.search();
		return list;
	}

	@Override
	public Employee searchById(int id) {
		Employee emp = empDao.searchById(id);
		return emp;
	}

	@Override
	public boolean add(Employee emp) {
		int rs = empDao.add(emp);
		return rs > 0;
	}

	@Override
	public boolean update(Employee emp) {
		int rs = empDao.update(emp);
		return rs > 0;
	}

	@Override
	public boolean delete(int id) {
		int rs = empDao.delete(id);
		return rs > 0;
	}

	@Override
	public boolean updateByDep(int depId) {
		int rs = empDao.updateByDep(depId);
		return rs > 0;
	}
}
