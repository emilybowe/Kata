package com.kata.wellofideas;

public class Kata {

    public static void well(String[] x) {
        int flag = 0;
        for(String idea : x) {
            switch (idea) {
                case "good" : {
                    flag += 1;
                    break;
                }
                case "bad" : {
                    break;
                }
            }
        }
        if(flag == 0) System.out.println("Fail!");
        else if (flag == 1 || flag == 2) System.out.println("Publish!");
        else if(flag >= 3) System.out.println("I smell a series!");
    }

    public static void main(String[] args) {
        String[] arrayOfIdeas = {"bad", "bad", "bad", "bad", "bad"};
        well(arrayOfIdeas);
    }

}
