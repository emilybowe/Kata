package com.kata.sumpositive;

public class Positive{
    public static int sum(int[] arr){
        int sum = 0;
        for(int number : arr) {
            if(number > 0) {
                sum += number;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {1,-4,7,12};
        sum(array);
    }
}
