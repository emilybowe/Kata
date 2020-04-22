package com.kata.onlyneedone;

public class Solution {
    public static boolean check(Object[] array, Object queriedObject) {
        boolean result = false;
        for(Object object : array) {
            if (object == queriedObject) {
                result = true;
            }
        }
        return result;
    }


    public static void main(String[] args) {
    
        check(new Object[]{66, 101}, 66);
        check(new Object[] {'t', 'e', 's', 't'}, 'e');
        check(new Object[]{66, 101}, 70);
        check(new Object[] {'t', 'e', 's', 't'}, 'a');
    }
}
