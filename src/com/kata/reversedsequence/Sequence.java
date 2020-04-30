package com.kata.reversedsequence;

import java.util.Arrays;

public class Sequence{

    public static int[] reverse(int n){
        int[] intArray = new int[n];
        int i = 0;
        for(int number : intArray) {
            intArray[i] = n;
            i++;
            n--;
        }
        return intArray;
    }

    public static void main(String[] args) {

        reverse(5);
    }

}
