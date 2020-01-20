package ch.bbw.consolecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator testee;

    @Test
    public void testSummeZweiPositivIsOK(){
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSummeZweiNegativOK(){
        testee = new Calculator();
        assertTrue(testee.summe(-10, -15) == -25);
    }

}
