package com.codegym.task.task12.task1226;

/* 
Climb, fly, and run

*/

public class Solution {

    public interface CanFly{
        public void fly();
    }
    public interface CanClimb{
        public void climb();
    }
    public interface CanRun{
        public void run();
    }


    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun{
        public void climb(){}
        public void run(){}
    }

    public class Dog implements  CanRun{
        public void run(){}
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun{
        public void run(){}
        public void fly(){}
    }
}
