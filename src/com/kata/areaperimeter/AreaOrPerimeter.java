package com.kata.areaperimeter;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        if(l == w) {
            return (l * w);
        }
        else {
            return ((l+w)*2);
        }
    }

    public static void main(String[] args) {
        areaOrPerimeter(3, 2);
    }
}
