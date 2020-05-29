package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("emp")
public class EmployeeController {

	// 一个注解针对一个
	@Autowired
	EmployeeService empService;
	@Autowired
	DepartmentService depService;

	// http://localhost:8013/emp/search
	@RequestMapping("search")
	public ModelAndView search() {
		ModelAndView mv = new ModelAndView("emp/emp");
		List<Employee> list = empService.search();
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping("showAdd")
	public ModelAndView showAdd() {
		ModelAndView mv = new ModelAndView("emp/add");
		List<Department> depList = depService.search();
		mv.addObject("depList", depList);
		return mv;
	}

	@RequestMapping("add")
	public String add(Employee emp) {
		boolean flag = empService.add(emp);
		return "redirect:search";
	}

	@RequestMapping("update")
	public String update(Employee emp) {
		boolean flag = empService.update(emp);
		return "redirect:search";
	}

	@RequestMapping("delete")
	public String delete(int id) {
		boolean flag = empService.delete(id);
		return "redirect:search";
	}

	@RequestMapping("showUpdate")
	public ModelAndView showUpdate(int id) {
		Employee emp = empService.searchById(id);
		List<Department> depList = depService.search();
		ModelAndView mv = new ModelAndView("emp/update");
		mv.addObject("depList", depList);
		mv.addObject("emp", emp);

		return mv;
	}
}
