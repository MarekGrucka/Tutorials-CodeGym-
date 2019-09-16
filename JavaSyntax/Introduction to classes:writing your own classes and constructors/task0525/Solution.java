package com.codegym.task.task05.task0525;

/* 
The whole duck isn't enough
The whole duck isn't enough
Using the Duck  class as a pattern, create Cat and Dog  classes.
What do you think the toString method in the Cat and Dog classes should return?
In the main method, create two objects of each class and display them on the screen.
Duck objects have already been created and are displayed on the screen.


Requirements:
1. Create a Cat class.
2. Create a Dog class.
3. The Cat class must correctly implement the toString method.
4. The Dog class must correctly implement the toString method.
5. In the main method, create two Cat objects.
6. In the main method, create two Dog objects.
7. Display all the created objects on the screen.
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
        //write your code here
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
    //write your code here
}
