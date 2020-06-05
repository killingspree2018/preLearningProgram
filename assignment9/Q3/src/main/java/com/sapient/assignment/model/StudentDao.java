package com.sapient.assignment.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	
	List<Student> list = new ArrayList<Student>();
	
	{
		list.add(new Student(100,"Divyansh","Jaipur"));
		list.add(new Student(101,"Dimple","Jaipur"));
		list.add(new Student(100,"Akshat","Jaipur"));
	}
	
	public Student findStudentById(int id){
		for(Student x: list) {
			if(x.getId() == id) {
				return x;
			}
		}
		return null;
	}
	
}
