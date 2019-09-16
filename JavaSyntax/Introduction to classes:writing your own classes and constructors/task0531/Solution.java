package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {

        int a1, a2, a3, a4;

        a1 = a < b ? a : b;
        a2 =  a1 < c ? a1 : c;
        a3 = a2 < d ? a2 : d;
        a4 = a3 < e ? a3 : e;

        return a4;
    }
}
