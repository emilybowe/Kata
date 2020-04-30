package com.kata.squaresum;
public class Kata
{
    public static void squareSum(int[] n)
    {
        int sum = 0;
        for(int number : n){
            sum += Math.pow(number, 2);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] testArray = {1, 2, 2};
        squareSum(testArray);
    }
}
