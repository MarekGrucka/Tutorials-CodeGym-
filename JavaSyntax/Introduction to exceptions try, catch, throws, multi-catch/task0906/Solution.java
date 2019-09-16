package com.codegym.task.task09.task0906;

/* 
Logging stack traces

*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {

        StackTraceElement[] o = Thread.currentThread().getStackTrace();
        String a = o[2].getClassName();
        String b = o[2].getMethodName();
        System.out.println(a + ": " + b + ": " + s );
        //write your code here
    }
}
