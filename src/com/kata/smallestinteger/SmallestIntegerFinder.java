package com.kata.smallestinteger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SmallestIntegerFinder {
    public static void findSmallestInt(int[] args) {
        System.out.println(IntStream.of(args).min().getAsInt());

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        findSmallestInt(numbers);
    }
}
