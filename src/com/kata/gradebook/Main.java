package com.kata.gradebook;

public class Main {
//Complete the function so that it finds the mean of the three scores passed to it and returns the letter value associated with that grade.
    public static void main(String[] args) {
       getGrade(80, 70, 90) ;
    }
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        if(score >= 0 && score < 60) {
            return 'F';}
        else if(score >= 60 && score < 70) {
            return 'D';}
        else if(score >= 70 && score < 80) {
            return 'C';}
        else if(score >= 80 && score < 90) {
            return 'B';}
        else if(score >= 90 && score <= 100) {
            return 'A';}
        else return 'X';
    }
}
