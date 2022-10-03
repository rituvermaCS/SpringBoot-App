package com.ritu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
	
	@Test
    void testConvertToDecimalSucess() throws Exception {
        int result = FactorialProgram.printFactorial(5f);
        Assertions.assertEquals(120, result);
    }

   @Test
    void testConvertToDecimalInvalidDenominator() {
        Assertions.assertThrows(Exception.class, () -> FactorialProgram.printFactorial(-2));
    }

}
