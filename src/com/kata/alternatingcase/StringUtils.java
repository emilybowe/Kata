package com.kata.alternatingcase;

public class StringUtils {

    public static void toAlternativeString(String string) {
        char[] letters = string.toCharArray();
        for(char letter : letters) {
            if(letter == Character.toLowerCase(letter)) {
                System.out.print(Character.toUpperCase(letter));
            }
            else System.out.print(Character.toLowerCase(letter));
        }
        System.out.println();
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
