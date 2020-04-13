package com.kata.blueandredmarbles;


public class Main {
    //guessBlue() should return the probability of drawing a blue marble, expressed as a float.
    // For example, guessBlue(5, 5, 2, 3) should return 0.6

    public static void main(String[] args) {
        System.out.println(guessBlue(1, 2, 3, 4));
    }
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        double remainingMarbles = (blueStart + redStart) - (bluePulled + redPulled);
        double remainingBlue = blueStart - bluePulled;
        return remainingBlue / remainingMarbles;
    }
}


