package com.sapient.Int_Arr_Process;

import java.util.ArrayList;
import java.util.List;

public class Int_Arr_ProcessRunner {
	
	public static void main(String[] args) {
		
		Int_Arr_Process a1 = new Int_Arr_Process(5);
		a1.readArray();	
		a1.displayArrayHorizontally();
		a1.biggestAndSmallestInArray();
		
		Int_Arr_Process a2 = new Int_Arr_Process();
		a2.readArray();
		a2.sortArray();
		a2.displayArrayVertically();
		
		List<Integer> array = new ArrayList<Integer>(6);
		array.add(5);
		array.add(5);
		array.add(4);
		array.add(4);
		array.add(3);
		array.add(3);
		Int_Arr_Process a3 = new Int_Arr_Process(array);

		a3.displayArrayHorizontally();
		a3.sumOfArray();
		a3.secondBiggestInArray();
	}

}
