package com.company.FindMaxNumber;

public class FindMaxNumber {
    public int max(int[] input) {
        int res = input[0];
        for(int elem:input) res = elem > res ? elem : res;
        return res;
    }
}
