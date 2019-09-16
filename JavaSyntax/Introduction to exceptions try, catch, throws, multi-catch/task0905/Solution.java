package com.codegym.task.task09.task0905;

/* 
In the blue depths of the stack trace…

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int num = 0;
        for (StackTraceElement element : elements){
            num++;
        }
        System.out.println(num);
        return num;

        // write your code here
    }
}

