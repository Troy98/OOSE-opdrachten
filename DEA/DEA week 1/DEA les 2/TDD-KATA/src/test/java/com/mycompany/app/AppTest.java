package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void emptyStringShouldReturnZero()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void oneNumberShouldReturnThatNumber() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void twoNumbersShouldReturnTheirSum() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void newLineShouldReturnTheirSum(){
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1\n2,3");
        assertEquals(6, result);
    }


}
