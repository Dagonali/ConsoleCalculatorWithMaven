package ch.bbw.consolecalculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import javax.print.DocFlavor;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author Ali Da Silva Ouederni
 * @version 20. Jan
 *
 */

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

    @Test
    public void testSummeZweiMIN_VALUE(){
        assertTrue(calculator.summe(Integer.MIN_VALUE, Integer.MIN_VALUE) == 0);
    }

    @Test
    public void testSummeMAX_VALUEundMIN_VALUE(){
        assertTrue(calculator.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testSummeMAX_VALUEundNegativ(){
        assertTrue(calculator.summe(Integer.MAX_VALUE, -5) == 2147483642);
    }

    @Test
    public void testSubtraktionZweiPositivIsOK(){
        assertTrue(calculator.differenz(5, 3) == 2);
    }

    @Test
    public void testsubtraktionZweiNegativOK(){
        assertTrue(calculator.differenz(-5, -2) == -3);
    }

    @Test
    public void testSubtraktionPositivUndNegativ(){
        assertTrue(calculator.differenz(10, -30) == 40);
    }

    @Test
    public void testSubtraktionZweiNull(){
        assertTrue(calculator.differenz(0,0) == 0);
    }

    @Test
    public void testSubtraktionZweiMAX_VALUE(){
        assertTrue(calculator.differenz(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
    }

    @Test
    public void testSubtraktionZweiMIN_VALUE(){
        assertTrue(calculator.differenz(Integer.MIN_VALUE, Integer.MIN_VALUE) == 0);
    }

    @Test
    public void testSubtraktionMAX_VALUEundMIN_VALUE(){
        assertTrue(calculator.differenz(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testSubtraktionMAX_VALUEundNull(){
        assertTrue(calculator.differenz(Integer.MAX_VALUE, 1) == 2147483646);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZweiPositivOK(){
        assertTrue(calculator.quotient(6, 0) == 0);
    }

    @Test
    public void testDivisionNegativUndPositivOK()
        throws ArithmeticException {
        assertTrue(calculator.quotient(-4, 1) == -4);
    }

    @Test
    public void testDivisionZweiNegativ(){
        assertTrue(calculator.quotient(-4,-1) == 4);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionMitNull(){
        assertTrue(calculator.quotient(8, 0) == 0);
    }

    @Test
    public void testDivisionWithTwoMAX_VALUE(){
        assertTrue(calculator.quotient(Integer.MAX_VALUE, Integer.MAX_VALUE) == 1);
    }

    @Test
    public void testDivisionWithTwoMIN_VALUE(){
        assertTrue(calculator.quotient(Integer.MIN_VALUE, Integer.MIN_VALUE) == 1);
    }

    @Test
    public void testDivisionMAX_VALUEwithOne(){
        assertTrue(calculator.quotient(Integer.MAX_VALUE, 1) == 2.147483647E9);
    }

    @Test
    public void testDivisionMIN_VALUEwithNegativeOne(){
        assertTrue(calculator.quotient(Integer.MIN_VALUE, 1) == -2147483648);
    }

}
