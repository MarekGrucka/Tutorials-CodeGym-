package com.codegym.task.task09.task0902;

/* 
Stack trace revisited

*/

import sun.awt.windows.ThemeReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[2].getMethodName();
        //write your code here
    }

    public static String method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[2].getMethodName();
        //write your code here
    }

    public static String method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[2].getMethodName();
        //write your code here
    }

    public static String method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[2].getMethodName();
        //write your code here
    }

    public static String method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[2].getMethodName();
        //write your code here
    }
}
