package com.codegym.task.task06.task0613;

/* 
Cat and statics

*/

public class Solution {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
        {
            Cat cat = new Cat();
    }// Create 10 cats
        System.out.println(Cat.catCount);

        // Display the value of the variable catCount
    }

    public static class Cat {

        public static int catCount = 0;

        public Cat()
        {
            catCount++;
        }
        // Create a static variable catCount

        // Declare a constructor
    }
}
