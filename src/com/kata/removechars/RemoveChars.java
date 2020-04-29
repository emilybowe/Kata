package com.kata.removechars;

public class RemoveChars {
    public static String remove(String str) {
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.deleteCharAt(str.length()-1);
        builder.deleteCharAt(0);
        return new String(builder);
    }

    public static void main(String[] args) {
        remove("sourdough");
    }
}
