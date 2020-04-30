package com.kata.name;

public class Name{
    public static String helloName(final String name){

        if(name == null || name.equals(""))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }
    public static void main(String[] args) {
        helloName("Javatlacati");
    }
}