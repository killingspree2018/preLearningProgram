package com.sapient.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddEmployee {
	
	List<Employee> list = new ArrayList<Employee>(Arrays.asList(new Employee(101,"Dimple","Jaipur")));
	
	void addEmployee(Employee emp) {
		if (emp == null)
			throw new IllegalArgumentException();
		list.add(emp);
	}
	
	Employee getEmployee(int id) {
		
		if (id<0)
			throw new IllegalArgumentException();
		for(Employee emp : list) {
			if(emp.getId() == id)
				return emp;
		}
		return null;
	}	
	
}
