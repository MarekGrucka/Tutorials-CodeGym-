package com.codegym.task.task10.task1001;

/* 
Task No. 1 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (char) a + 46;
        byte c = (byte) (a * b);
        double f = (float) 1234.15;
        long d = (int) (a + f / c + b);
        System.out.println(c); // 0 + 1234.15/0
    }
}
