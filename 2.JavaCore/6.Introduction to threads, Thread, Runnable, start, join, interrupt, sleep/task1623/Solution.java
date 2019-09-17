package com.codegym.task.task16.task1623;

/* 
Creating threads recursively

*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount= 1;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{


        @Override
        public String toString() {
            return createdThreadCount + " created";
        }


        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            this.start();
        }

        @Override
        public void run() {
            super.run();
            if(createdThreadCount < Solution.count){
                Thread n = new GenerateThread();
                System.out.println(n.toString());
                }
        }
    }
}
