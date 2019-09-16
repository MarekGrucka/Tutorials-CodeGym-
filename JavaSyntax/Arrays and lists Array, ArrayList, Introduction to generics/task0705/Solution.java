package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] large = new int[20];
        for (int i = 0; i < large.length; i++) {
            large[i] = Integer.parseInt(reader.readLine());
        }
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < (large.length / 2); i++) {
            small1[i] = large[i];
        }

        for (int i = 0; i < (large.length / 2); i++) {
            small2[i] = large[i + 10];
            System.out.println(small2[i]);
        }

        //write your code here
    }
}
