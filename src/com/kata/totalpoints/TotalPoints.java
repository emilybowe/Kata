package com.kata.totalpoints;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        int championshipPoints = 0;
        for(String game: games) {
            String[] score = game.split(":");
            int ourScore = Integer.parseInt(score[0]);
            int theirScore = Integer.parseInt(score[1]);
            if(ourScore > theirScore) {
                championshipPoints += 3;
            }
            else if(ourScore == theirScore) {
                championshipPoints += 1;
            }
        }
        return championshipPoints;
    }
    public static void main(String[] args) {
        String[] games = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        points(games);
    }
}
