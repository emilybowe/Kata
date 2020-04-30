package com.kata.century;

public class Solution {
    public static int century(int number) {
        int centuryNo = number/100;
        if(number%10 == 0 && number%100 ==0) {
            return centuryNo;
        }
        else {
            return centuryNo + 1;
        }
    }

    public static void main(String[] args) {
        century(1900); //19
        century(1950); //20
        century(2000); //20
    }
}
