package com.sapient.number;

import java.util.ArrayList;
import java.util.List;

public class number {
	
	public static boolean checkPrime(int x) {
		if (x<0)
			throw new IllegalArgumentException();
		for(int i=2;i<x;i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkAmstrong(int x) {
		if (x<0)
			throw new IllegalArgumentException();
		int value = x;
		while(x !=0 ) {
			value -= (x%10)*(x%10)*(x%10);
			x=x/10;
		}
		if(value == 0)
			return true;
		else
			return false;
		
	}
	
	public static boolean checkPolindrom(int x) {
		if (x<0)
			throw new IllegalArgumentException();
		List<Integer> values = new ArrayList<>();
		while(x !=0 ) {
			values.add(x%10);
			x=x/10;
		}
		int start = 0;
		int end = values.size() - 1;
		while(start<=end) {
			if(values.get(start) != values.get(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
}
