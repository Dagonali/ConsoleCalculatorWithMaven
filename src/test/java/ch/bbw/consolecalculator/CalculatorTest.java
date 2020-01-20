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

}
