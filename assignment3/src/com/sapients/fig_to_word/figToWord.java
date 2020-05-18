package com.sapients.fig_to_word;

public class figToWord {
	
	private static final String[] specialNames = {
			
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	        
	    };
	    
	    private static final String[] tensNames = {
	    		
	        "",
	        " ten",
	        " twenty",
	        " thirty",
	        " forty",
	        " fifty",
	        " sixty",
	        " seventy",
	        " eighty",
	        " ninety"
	        
	    };
	    
	    private static final String[] numNames = {
	    		
	        "",
	        " one",
	        " two",
	        " three",
	        " four",
	        " five",
	        " six",
	        " seven",
	        " eight",
	        " nine",
	        " ten",
	        " eleven",
	        " twelve",
	        " thirteen",
	        " fourteen",
	        " fifteen",
	        " sixteen",
	        " seventeen",
	        " eighteen",
	        " nineteen"
	        
	    };
	    
	    
	private static String convertLessThanOneThousand(int n) {
	    	
	        String current;
	        
	        if (n % 100 < 20){
	            current = numNames[n % 100];
	            n /= 100;
	        }
	        else {
	            current = numNames[n % 10];
	            n /= 10;            
	            current = tensNames[n % 10] + current;
	            n /= 10;
	        }
	        
	        if (n == 0) return current;
	        return numNames[n] + " hundred" + current;
	}
	    
	public static String fig_to_word(long number) {
		
		if (number == 0) {
			return "zero"; 
		}
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String Word = "";
        int  i = 0; // this specifies the power of 1000 the number is at.
        
        do {
            long n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand((int) n);
                Word = s + specialNames[i] + Word;
            }
            i++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + Word).trim() + " only.";
	}
}
