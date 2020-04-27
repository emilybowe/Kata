package com.kata.reverse;

public class Reverse {
    public static String solution(String str) {
        char[] strCharArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = strCharArray.length - 1; i > -1; i--) {
            builder.append(strCharArray[i]);
        }
        return new String (builder);
    }

    public static void main(String[] args) {
        solution("gate");
    }
}
