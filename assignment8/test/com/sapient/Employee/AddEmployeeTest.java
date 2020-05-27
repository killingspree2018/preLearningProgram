package com.sapient.Employee;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddEmployeeTest {
	
	private AddEmployee ob;
	
	@BeforeEach
	void setup() {
		ob = new AddEmployee();
	}

	@Test
	void addEmployeeSuccess() {
		Employee emp = new Employee(102,"Divyansh","Jaipur");
		ob.addEmployee(emp);
		assertTrue(ob.list.contains(emp));
	}
	
	@Test
	void addEmployeeThrowsException() {	
		assertThrows(IllegalArgumentException.class,() -> {
			ob.addEmployee(null);
		});
	}
	
	@Test
	void getEmployeeFound() {
		Employee emp = new Employee(101,"Dimple","Jaipur");
		assertEquals(emp,ob.getEmployee(101));
	}
	
	@Test
	void getEmployeeNotFound() {
		ob.getEmployee(102);
		assertEquals(null,ob.getEmployee(102));
	}
	
	@Test
	void getEmployeeThrowsException() {	
		assertThrows(IllegalArgumentException.class,() -> {
			ob.getEmployee(-1673);
		});
	}
	
	@AfterEach
	void tearDown() {
		ob = null;
	}

}
