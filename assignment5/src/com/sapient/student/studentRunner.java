package com.sapient.student;

 
public class studentRunner {
	
	public static void main(String[] args) {
		
		studentBo x = new studentBo();
		
		x.readStudent();
		x.displayStudent();
		x.studentsByCity("gurgaon");
		x.sortByName();
		x.sortByCity();
		x.studentsById(101);
		
	}
}
