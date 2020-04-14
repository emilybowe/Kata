package com.kata.blueandredmarbles;

public class Main {
    public static void main(String[] args) {
        System.out.println(probabilityOfPickingBlueMarble(1, 2, 3, 4));
    }
    public static double probabilityOfPickingBlueMarble(int blueMarblesAdded, int redMarblesAdded, int blueMarblesRemoved, int redMarblesRemoved) {
        double totalMarblesRemaining = (blueMarblesAdded + redMarblesAdded) - (blueMarblesRemoved + redMarblesRemoved);
        double blueMarblesRemaining = blueMarblesAdded - blueMarblesRemoved;
        return blueMarblesRemaining / totalMarblesRemaining;
    }
}


