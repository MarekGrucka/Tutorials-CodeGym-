package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);


        //write your code here

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        result.add(dog1);
        result.add(dog2);
        result.add(dog3);
        //write your code here
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        HashSet<Object> animals = new HashSet<Object>();
        animals.addAll(cats);
        animals.addAll(dogs);

        //write your code here
        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
       // Iterator<pets> iterator = pets.iterator();
       // while (iterator.hasNext()){

       // }

        //write your code here
    }

    public static void printPets(Set<Object> pets) {

        for (Object p : pets){
            System.out.println(p);
        }
        //write your code here
    }

    public static class Dog{
        public Dog(){}
    }
    public static class Cat{
        public Cat(){}
    }
    //write your code here
}
