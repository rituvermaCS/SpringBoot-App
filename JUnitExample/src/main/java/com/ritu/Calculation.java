package com.ritu;

public class Calculation {



	   public static double convertToDecimal(int numerator , int den) {
	        if(den == 0) {
	            throw new IllegalArgumentException("Denomenator must not be 0");
	        }
	        return (double) numerator/(double) den;
	        
	    }
	}