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

}
