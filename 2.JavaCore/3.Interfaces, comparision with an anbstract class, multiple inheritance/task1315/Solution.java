package com.codegym.task.task13.task1315;

/* 
Tom, Jerry and Spike

*/

public class Solution {
    public static void main(String[] args) {

    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }

    class Cat implements CanMove, Edible, CanEat{
        public void move(){}
        public void beEaten(){}
        public void eat(){}
    }
    class Dog implements CanMove, CanEat{
        public void move(){}
        public void eat(){}
    }
    class Mouse implements CanMove, Edible{
        public void move(){}
        public void beEaten(){}

    }
}