package com.kata.messigoals;

class Goals {
    public static int laLigaGoals = 5;
    public static int championsLeagueGoals = 4;
    public static int copaDelReyGoals = 1;
    public static int totalGoals = (laLigaGoals + championsLeagueGoals + copaDelReyGoals);

    public static void main(String[] args) {
        System.out.println(Goals.totalGoals);
    }
}
