package com.company.FindMaxNumber;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {
    FindMaxNumber findmaxnumber = new FindMaxNumber();
    @Test
    public void SimpleFindMaxNumber(){
        int[] input = {1,2,3,4,5};
        int expected = 5;

        int actualresult = findmaxnumber.max(input);

        Assert.assertEquals("Error",expected,actualresult);
    }

    @Test
    public void NegativeFindMaxNumber(){
        int[] input = {-1,-2,-5,-3};
        int expected = -1;

        int actualresult = findmaxnumber.max(input);

        Assert.assertEquals("Error",expected,actualresult);
    }

}
