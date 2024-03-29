package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++)
        {

            array[i] = Integer.parseInt(reader.readLine());
        }

        // Create and populate the array
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i <array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        // Find the maximum
        return max;
    }
}
