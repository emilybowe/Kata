package com.kata.alternatingcase;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtils {

    public static void toAlternativeString(String string) {
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == Character.toLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
                System.out.println(charArray[i]);
            } else if (charArray[i] == Character.toUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
                System.out.println(charArray[i]);
            }
        }
        String newString = new String(charArray);
        System.out.println(newString);
    }
    public static void main(String[] args) {
        String lowerCase = "abc";
        String upperCase = "ABC";
        String numbers = "123";
        String mixed = "abc123ABC";

        toAlternativeString(lowerCase);
        toAlternativeString(upperCase);
        toAlternativeString(numbers);
        toAlternativeString(mixed);
    }
}

