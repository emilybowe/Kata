package com.kata.mixedsum;
import java.util.ArrayList;
import java.util.List;

public class MixedSum {
    public static int sum(List<?> mixed) {
        int count = 0;
        for(Object x: mixed) {
            if(x instanceof String) {
                int stringInt = Integer.valueOf((String)x);
                count += stringInt;
            }
            else if (x instanceof Integer){
                int intInt = (Integer) x;
                count += intInt;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add("5");
        sum(list);

}