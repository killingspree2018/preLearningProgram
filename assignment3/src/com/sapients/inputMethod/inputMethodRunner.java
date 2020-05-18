package com.sapients.inputMethod;

import java.io.IOException;

public class inputMethodRunner {
	
	public static void main(String[] args) throws IOException {
		
		Command_Line1 object = new Command_Line1();
		object.setData(5,args);
		object.calData();
		object.displayData();
		
		KeyRead_Line2 object1 = new KeyRead_Line2();
		object1.Read(5);
		object1.display();
		object1.sort();
		object1.display();
		object1.find(4);
		
	}
}
