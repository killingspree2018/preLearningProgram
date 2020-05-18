package com.sapient.Num_Process;
public class Num_ProcessRunner {

	public static void main(String[] args) {
		
		Num_Process[] Processes = {new add(), new subtract(), new multiply(), new divide()};
		
		System.out.println("Enter the Numbers on which you want to perform operations.");
		System.out.println("Enter the choice of operation from below options \n 0 - Add \n 1 - Subtract \n 2 - Multiply \n 3 - Divide \n");
		int a = read.rd.nextInt();
		int b = read.rd.nextInt();
		int choice = read.rd.nextInt();
		
		int result = Processes[choice].cal(a,b);
		System.out.println(result);
	}
		
}
