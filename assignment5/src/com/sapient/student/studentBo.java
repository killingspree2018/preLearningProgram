package com.sapient.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class studentBo {
	
	   List<student> students = new ArrayList<student>(Arrays.asList(new student[] {new student(101,"Divyansh","Jaipur"), new student(102,"Dimple","Jaipur"), new student(103,"Dime","gurgaon"),  new student(104,"Die","gurgaon")}));
    
		public void readStudent() {
			System.out.println("Enter the name id, name and city of the students");
			students.add(new student(Integer.parseInt(read.rd.nextLine()),read.rd.nextLine(),read.rd.nextLine()));	
		}
		public void displayStudent() {
			students.stream().forEach(System.out::println);
		}
		public void studentsByCity(String city) {
			students.stream().filter(student -> student.getCity().equals(city)).forEach(System.out :: println);
			
		}
		public void sortByName() {
			students.sort((student1,student2) -> student1.getName().compareTo(student2.getName()));
			students.stream().forEach(System.out :: println);
		}
		public void sortByCity() {
			students.sort((student1,student2) -> student1.getCity().compareTo(student2.getCity()));
			students.stream().forEach(System.out :: println);
		}
		public void studentsById(int id) {
			students.stream().filter(student -> student.getId() == id).forEach(System.out :: println);
		}

}
