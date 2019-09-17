package com.codegym.task.task13.task1309;

/* 
All that moves

*/

public class Solution {
    public static void main(String[] args) {
    }
    interface CanMove{
        default Double speed(){return null;}
    }
    interface CanFly extends CanMove{
        default Double speed(CanFly a){return null;}
    }

}