package com.kata.divisible;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
    public static void main(String[] args) {
        isDivisible(4, 4, 2); //yes
        isDivisible(4, 4, 3); //no
        isDivisible(4, 3, 4); //no
    }
}
