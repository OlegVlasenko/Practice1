package com.company.SumDigits;

import org.junit.Assert;
import org.junit.Test;

public class SumDigitsTest {
    SumDigits sumdigits = new SumDigits();
    @Test
    public void SimpleSumDigitsTest(){
        int input = 123;
        int expected = 6;

        int actualresult = sumdigits.sum(input);

        Assert.assertEquals("Error",expected,actualresult);
    }
    @Test
    public void NegativeSumDigitsTest(){
        int input = -256;
        int expected = 13;

        int actualresult = sumdigits.sum(input);

        Assert.assertEquals("Error",expected,actualresult);
    }
    @Test
    public void OutOfBoundsSumDigitsTest(){
        int input = -2147483648;
        int expected = 47;

        int actualresult = sumdigits.sum(input);

        Assert.assertEquals("Error",expected,actualresult);
    }

}
