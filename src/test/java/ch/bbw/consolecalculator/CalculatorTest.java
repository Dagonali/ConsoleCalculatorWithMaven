package ch.bbw.consolecalculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testSummeZweiPositivIsOK(){
        assertTrue(calculator.summe(10, 25) == 35);
    }

    @Test
    public void testSummeZweiNegativOK(){
        assertTrue(calculator.summe(-10, -15) == -25);
    }

    @Test
    public void testSummeNegativUndPositive(){
        assertTrue(calculator.summe(10, -30) == -20);
    }

    @Test
    public void testSummeZweiNull(){
        assertTrue(calculator.summe(0, 0) == 0);
    }

    @Test
    public void testSummeZweiMAX_VALUE(){
        assertTrue(calculator.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -2);
    }

}
