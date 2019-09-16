package com.codegym.task.task09.task0904;

/* 
Stack trace with 10 calls

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();//write your code here
    }

    public static StackTraceElement[] method3() {
        return  method4();
        //write your code here
    }

    public static StackTraceElement[] method4() {
        return  method5();
        //write your code here
    }

    public static StackTraceElement[] method5() {
        return  method6(); //write your code here
    }

    public static StackTraceElement[] method6() {
        return  method7();
        //write your code here
    }

    public static StackTraceElement[] method7() {
        return  method8();//write your code here
    }

    public static StackTraceElement[] method8() {
        return  method9();//write your code here
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
