package com.company.JoinCharacters;

public class JoinCharacters  {
    public static int join(char[] input) {

        int res = 0;
        int pos = input.length - 1;

        for (char sym : input) res += Character.getNumericValue(sym) * Math.pow(10, pos--);

        return res;
    }

}
