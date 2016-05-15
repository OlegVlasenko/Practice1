package com.company.SumDigits;

public class SumDigits {
    public int sum(int number) {
        int buff = number;
        int res = 0;

        while (buff!=0){
            res += Math.abs(buff % 10);
            buff /= 10;
        }
        return res;
    }
}