package com.ritu;

import java.util.Scanner;

public class FactorialProgram {
	
public static int printFactorial(float a) throws Exception {
        
        if(a < 0) {
            throw new Exception();
        }
        int c = 1;
        for(int i=1 ; i <= a; i++) {
            c = c*i;
        }
        return c;
    }

}
