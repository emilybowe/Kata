package com.kata.cuboid;

public class cuboid {

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
       return length * width * height;
    }

    public static void main(String[] args) {
        getVolumeOfCuboid(2.0, 2.0, 2.0);
    }
}
