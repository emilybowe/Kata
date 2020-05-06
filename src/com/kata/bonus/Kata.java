package com.kata.bonus;

public class Kata{
    public static String bonusTime(final int salary, final boolean bonus) {
        if(bonus) {
            return ("\u00A3" + salary * 10);
        }
        return ("\u00A3" + salary);
    }

    public static void main(String[] args) {
        bonusTime(100, true);
    }
}
