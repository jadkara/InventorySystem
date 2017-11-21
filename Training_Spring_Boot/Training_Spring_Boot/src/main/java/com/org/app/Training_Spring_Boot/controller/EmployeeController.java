package com.org.app.Training_Spring_Boot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.Training_Spring_Boot.domain.Employee;
import com.org.app.Training_Spring_Boot.service.EmployeeService;

@RestController
@RequestMapping("/Employeeinfo")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/employees")
	public List<Employee> getAllEmployee()
	{
		 return employeeService.getAllEmployee();		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/employees/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId)
	{
		 return employeeService.getEmployee(employeeId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void getEmployee(@RequestBody Employee employee)
	{
		 employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{employeeId}")
	public void updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee)
	{
		 employeeService.updateEmployee(employeeId, employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{employeeId}")
	public void removeEmployee(@PathVariable String employeeId)
	{
		 employeeService.removeEmployee(employeeId);
	}
	

}
