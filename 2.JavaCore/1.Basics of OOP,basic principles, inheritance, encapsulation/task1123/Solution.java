package com.codegym.task.task11.task1123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};


        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {

        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }


        Integer[] array2 = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            array2[i] = array[i];

        }

        ArrayList<Integer> comp = new ArrayList<Integer>(Arrays.asList(array2));

        Integer y = Collections.max(comp);
        Integer x = Collections.min(comp);

        //write your code here

        return new Pair<Integer, Integer>(x, y);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
