package com.org.app.Training_Spring_Boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.app.Training_Spring_Boot.domain.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> employeeList = new ArrayList<>(Arrays.asList(
			new Employee("A101", "Abc", "Pqr"),
			new Employee("A102", "Lmn", "Xyz"),
			new Employee("A103", "Abc", "Xyz")
			));

	public List<Employee> getAllEmployee() {
		return employeeList;
		
	}

	public Employee getEmployee(String empId) {
		return employeeList.stream().filter(e -> e.getEmployeeId().equals(empId)).findFirst().get();

	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		
	}

	public void updateEmployee(String employeeId, Employee employee) {
       
		for(int i=0;i<employeeList.size();i++)
		{
			if(employeeList.get(i).getEmployeeId().equals(employeeId))
			{
				employeeList.set(i, employee);
				return;
			}
		}
		
	}

	public void removeEmployee(String employeeId) {
		employeeList.removeIf(e -> e.getEmployeeId().equals(employeeId));
	}
			

}
