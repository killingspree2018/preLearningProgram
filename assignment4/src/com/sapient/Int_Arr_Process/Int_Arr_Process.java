package com.sapient.Int_Arr_Process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Int_Arr_Process {
	int n;
	List<Integer> array;
	

//default constructor  (ii)
	public Int_Arr_Process() {
		n=10;
		array = new ArrayList<Integer>(n);
	}
//constructor to specify the length of array	(i)
	public Int_Arr_Process(int n) {
		this.n=n;
		array = new ArrayList<Integer>(n);
	}
//constructor to adopt a given array	(iii)
	public Int_Arr_Process(List<Integer> array) {
		this.n = array.size();
		array = new ArrayList<Integer>(n);
		for(int i=0 ; i<n; i++) {
			this.array.add(array.get(i));
		}
	}
//copy constructor       (iv)
	Int_Arr_Process(Int_Arr_Process a){
		this.n = a.n;
		for(int i=0 ; i<a.n; i++) {
			this.array.add(a.array.get(i));
		}		
	}
//method to read array (v)
	public void readArray() {
		for(int i=0; i<n; i++) {
			array.add(read.rd.nextInt());
		}	
	}
// (vi)
	public void displayArrayHorizontally() {
		for(int i=0; i<n; i++) {
			System.out.print(array.get(i) + " ");
		}	
		System.out.println();
	}
	public void displayArrayVertically() {
		for(int i=0; i<n; i++) {
			System.out.println(array.get(i));
		}	
	}
// (vii)
	public void sortArray() {	 
		Collections.sort(array);
	}
// (viii)
	public void biggestAndSmallestInArray() {	 
		System.out.println("The biggest number in the array " + Collections.max(array));
		System.out.println("The smallest number in the array " + Collections.min(array));
	}
// (ix)
	public void sumOfArray() {
		int sum=0;
		for(int number : array) {
			sum+=number;
		}
		System.out.println("Sum of the elements of Array is " + sum);
	}
// (x)
	public void secondBiggestInArray() {
		int biggest = 0,secondBiggest = 0;
		for(int number : array) {
			if(number>biggest) {
				biggest = number;	
			}
		}
		for(int number : array) {
			if(secondBiggest<number && number<biggest) {
				secondBiggest = number;
			}
		}
		System.out.println("Second Biggest element of the Array is " + secondBiggest);
	}
	
	
}
