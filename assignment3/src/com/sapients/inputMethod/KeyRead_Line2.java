package com.sapients.inputMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 

public class KeyRead_Line2 {
	List<Integer> list = new ArrayList<>();
	int n; //number of data entries
	private Scanner scanner;
	
	public void Read(int n){
		
		this.n = n;
		scanner = new Scanner(System.in);
		for (int i = 0; i<n ; i++) {
			list.add(scanner.nextInt());
		}	
	}

	public void display() {
		 System.out.println(list);	
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void find(int n) {
		if(list.indexOf(n) != -1) {
			System.out.println("number is present");
		}
		else {
			System.out.println("number is not present");
		}
	}
	
}
 

 
