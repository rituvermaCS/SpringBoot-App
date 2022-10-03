package com.ritu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationTest {



   @Test
    void testConvertToDecimalSucess() {
        double result = Calculation.convertToDecimal(16, 4);
        Assertions.assertEquals(4.0,result);
    }
    
     @Test
        void testConvertToDecimalInvalidDenominator() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> Calculation.convertToDecimal(3,0));
        }




}