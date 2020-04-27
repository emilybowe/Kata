package com.kata.reversedigits;
import java.util.ArrayList;
import java.util.Arrays;

public class ReversedDigits {

    public static void digitize(long n) {
        ArrayList<Integer> intArray = new ArrayList<>();
        while(n!=0) {
            intArray.add((int)n%10);
            n = n/10;
        }
        int[] arr = intArray.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        digitize(49853438);
    }
}
