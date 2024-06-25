package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;



public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorial(){
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(2, FactorialCalculator.calculateFactorial(2));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }



    @Test
    public void testCalculateFactorialNegativeNum(){
        Exception exception = assertThrows(IllegalAccessException.class, () -> FactorialCalculator.calculateFactorial(-1));
        assertEquals("Число должно быть положительное", exception.getMessage());
    }
}
