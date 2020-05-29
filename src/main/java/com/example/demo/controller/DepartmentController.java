package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("dep")
public class DepartmentController {
	
	@Autowired
	DepartmentService depService;


	@RequestMapping("search")
	public ModelAndView search() {
		ModelAndView mv = new ModelAndView("dep/dep");
		List<Department> list = depService.search();
		mv.addObject("list", list);
		return mv;
	}
//
	@RequestMapping("add")
	public String add(Department dep) {
		boolean flag = depService.add(dep);
		return "redirect:search";
	}
//
	@RequestMapping("update")
	public String update(Department dep) {
		boolean flag = depService.update(dep);
		return "redirect:search";
	}
//
	@RequestMapping("delete")
	public String delete(int id) {
		boolean flag = depService.delete(id);
		return "redirect:search";
	}

	@RequestMapping("showAdd")
	public String showAdd() {
		return "dep/add";
	}

	@RequestMapping("showUpdate")
	public ModelAndView showUpdate(int id) {
		ModelAndView mv = new ModelAndView("dep/update");
		Department dep = depService.searchById(id);
		mv.addObject("dep", dep);
		return mv;
	}
}
