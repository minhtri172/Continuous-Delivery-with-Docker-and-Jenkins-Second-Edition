package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     private Calculator calculator = new Calculator();
     //private CalculatorApplication calculatorApplication = new CalculatorApplication();   
     //private CalculatorController calculatorController = new CalculatorController();

     @Test
     public void testSum() {
          assertEquals(2, calculator.sum(2, 3));
          assertEquals(2, calculator.sum(3, 3));
     }
}
