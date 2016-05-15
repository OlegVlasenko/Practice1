package com.company.FirstOddNumber;

import org.junit.Assert;
import org.junit.Test;

public class TestFirstOddNumber {
    FirstOddNumber firstoddnumber = new FirstOddNumber();
    @Test
    public void SimpleSumDigitsTest(){
        int[] input = {1,2,3,4,5};
        int expected = 0;

        int actualresult = firstoddnumber.find(input);

        Assert.assertEquals("Error",expected,actualresult);
    }
}
