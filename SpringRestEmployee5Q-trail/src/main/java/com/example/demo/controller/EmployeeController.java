package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.model.Employee;

@Controller
public class EmployeeController {
	

	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String home()
	{
	return "home.jsp";
	}

	@RequestMapping("/addEmployee")
	public String Employee(Employee employee)
	{
	repo.save(employee);
	return "home.jsp";

	}
	


	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int eId)
	{
	ModelAndView mv=new ModelAndView("show.jsp");
	Employee employee=repo.findById(eId).orElse(new Employee());
	mv.addObject(employee);
	return mv;
	}
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(Employee employee)
	{
		repo.delete(employee);
	return "deleteEmployee.jsp";

	}
	

}
