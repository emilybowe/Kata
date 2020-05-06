package com.kata.tipcalculator;

public class TipCalculator {

    public static void calculateTip(double amount, String rating) {
        switch (rating.toLowerCase()) {
            case "terrible": {
                System.out.println((int)Math.round(amount*0));
                break;
            }
            case "poor": {
                System.out.println( (int)Math.round(amount*0.05));
                break;
            }
            case "good": {
                System.out.println( (int)Math.round(amount*0.10));
                break;
            }
            case "great": {
                System.out.println( (int)Math.round(amount*0.15));
                break;
            }
            case "excellent": {
                System.out.println( (int)Math.round(amount*0.20));
                break;
            }
            default: {
                System.out.println( "null");
                break;
            }
        }
    }

    public static void main(String[] args) {
        calculateTip(32.10, "pooR");
    }
}
