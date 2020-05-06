package com.kata.countmonkeys;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MonkeyCounter
{
    public static void monkeyCount(final int n) {
        int[] intArray = new int[n];
        int i = n - 1;
        int j = 0;
        for(int number : intArray) {
            intArray[j] = n - i;
            i--;
            j++;
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void main(String[] args) {
        monkeyCount(1);
    }
}
