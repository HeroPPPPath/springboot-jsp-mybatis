package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDao depDao;
	@Autowired
	EmployeeDao empDao;

	@Override
	public List<Department> search() {
		List<Department> list = depDao.search();
		return list;
	}

	@Override
	public Department searchById(int id) {
		Department dep = depDao.searchById(id);
		return dep;
	}

	@Override
	public boolean add(Department dep) {
		int rs = depDao.add(dep);
		return rs > 0;
	}

	@Override
	public boolean update(Department dep) {
		int rs = depDao.update(dep);
		return rs > 0;
	}

	@Override
	public boolean delete(int id) {
		int rs = depDao.delete(id);// 执行一条sql语句（事务四大特性）
		rs = empDao.updateByDep(id);// 执行一条sql语句
		return rs > 0;
	}
}
