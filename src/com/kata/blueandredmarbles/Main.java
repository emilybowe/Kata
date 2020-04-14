package com.kata.blueandredmarbles;

public class Main {
    public static void main(String[] args) {
        System.out.println(probabilityOfPickingBlueMarble(1, 2, 3, 4));
    }
    public static double probabilityOfPickingBlueMarble(int blueStart, int redStart, int bluePulled, int redPulled) {
        double remainingMarbles = (blueStart + redStart) - (bluePulled + redPulled);
        double remainingBlue = blueStart - bluePulled;
        return remainingBlue / remainingMarbles;
    }
}


