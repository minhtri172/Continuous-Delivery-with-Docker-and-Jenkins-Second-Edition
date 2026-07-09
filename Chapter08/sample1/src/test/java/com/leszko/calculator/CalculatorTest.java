package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     private Calculator calculator = new Calculator();
     private CalculatorApplication calculatorApplication = new CalculatorApplication();   
     private CalculatorController calculatorController = new CalculatorController();

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(3, 3));
     }
}
