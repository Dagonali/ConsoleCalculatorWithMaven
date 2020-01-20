package ch.bbw.consolecalculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator testee;

    @Before
    public void setUp(){
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositivIsOK(){
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSummeZweiNegativOK(){
        assertTrue(testee.summe(-10, -15) == -25);
    }

}
