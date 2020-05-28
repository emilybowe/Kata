package com.kata.bmi;

public class Calculate {
    public static void bmi(double weight, double height) {
        double bmi = weight/Math.pow(height, 2);
        if (bmi <= 18.5) System.out.println( "Underweight");

        else if (bmi <= 25.0) System.out.println( "Normal");

        else if (bmi <= 30.0) System.out.println( "Overweight");

        else if (bmi > 30) System.out.println( "Obese");
    }

    public static void main(String[] args) {
        bmi(100, 1.5);
    }
}
