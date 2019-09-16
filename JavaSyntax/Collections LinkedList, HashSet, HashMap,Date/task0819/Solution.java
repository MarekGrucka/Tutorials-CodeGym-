package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            //iterator.remove();
            iterator.next();
            iterator.remove();
            break;
        }
        //write your code here. step 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        //write your code here. step 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats){
          System.out.println(cat);
        }
        // step 4
    }
public static class Cat{
    public static void cat(){

    }
    }
    // step 1
}
