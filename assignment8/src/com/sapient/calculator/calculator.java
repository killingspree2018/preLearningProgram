package com.sapient.calculator;

public class calculator {
	
	public static void main(String[] args) {
		calculatorInterface[] ob = {
				(a,b) -> {return a+b;},
				(a,b) -> {return a-b;},
				(a,b) -> {return a*b;},
				(a,b) -> {return a/b;}
			};
		
		int choice = read.rd.nextInt();
		while(choice!=-1) {
			System.out.println(ob[choice-1].evaluate(15,3));
			choice = read.rd.nextInt();
		}

	}
	
}
