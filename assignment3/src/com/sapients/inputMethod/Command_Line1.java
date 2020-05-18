package com.sapients.inputMethod;
import java.util.ArrayList;
import java.util.List;
 

public class Command_Line1 {
	List<Integer> list = new ArrayList<>();
	int n; //number of data entries
	int sum,biggest,smallest;
	float avg;
	

	public void setData(int n, String[] args) {
		this.n = n;
		if(args.length == 0) {
			System.out.println("no data in command line to read");
			return;
		}
		for (int i = 0; i<n ; i++) {
			list.add(Integer.parseInt(args[i]));
		}
	}
	
	public void calData() {
		if(list.size() == 0 ) {
			System.out.println("list is empty");
			return;
		}
		sum=0;
		biggest = Integer.MIN_VALUE;
		smallest = Integer.MAX_VALUE;
		for(int i : list) {
			sum+=i;
			if(i>biggest) {
				biggest=i;
			}
			if(i<smallest) {
				smallest=i;
			}	
		}
		avg = (float)sum/n;
	}

	public void displayData() {
		
		if(list.size() == 0 ) {
			System.out.println("list is empty");
			return;
		}
		
		System.out.printf("sum =  %d average = %f biggest = %d smallest %d",sum,avg,biggest,smallest);	
	}
	
}
