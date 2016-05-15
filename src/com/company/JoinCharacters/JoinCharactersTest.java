
package com.company.JoinCharacters;

import org.junit.Assert;
import org.junit.Test;


public class JoinCharactersTest  {
    @Test
    public void testJoin() {
        char[] input = {'1','2','3'};
        int expected = 123;

        int actualResult = JoinCharacters.join(input);

        Assert.assertEquals("Error", expected,actualResult);

    }

}
