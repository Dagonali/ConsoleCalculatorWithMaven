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

    @Test(expected = ArithmeticException.class)
    public void testDivisionZweiPositivOK(){
        assertTrue(calculator.quotient(6, 0) == 0);
    }

    @Test
    public void testDivisionNegativNullOK()
        throws ArithmeticException {
        assertTrue(calculator.quotient(-4, 1) == -4);
    }

}
