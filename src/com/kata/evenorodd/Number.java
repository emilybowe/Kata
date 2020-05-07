package com.kata.evenorodd;

public class Number {
    //e.g. 6
    //e.g. 7

    public static boolean isEven(double n) {
        return n % 2 == 0;
    }

    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        even_or_odd(3);
    }

}
