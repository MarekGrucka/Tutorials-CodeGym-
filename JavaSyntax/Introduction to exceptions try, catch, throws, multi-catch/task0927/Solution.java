package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<String, Cat>();
        Cat cat1 = new Cat("kot1");
        Cat cat2 = new Cat("kot2");
        Cat cat3 = new Cat("kot3");
        Cat cat4 = new Cat("kot4");
        Cat cat5 = new Cat("kot5");
        Cat cat6 = new Cat("kot6");
        Cat cat7 = new Cat("kot7");
        Cat cat8 = new Cat("kot8");
        Cat cat9 = new Cat("kot9");
        Cat cat10 = new Cat("kot10");

        cats.put(cat1.name, cat1);
        cats.put(cat2.name, cat2);
        cats.put(cat3.name, cat3);
        cats.put(cat4.name, cat4);
        cats.put(cat5.name, cat5);
        cats.put(cat6.name, cat6);
        cats.put(cat7.name, cat7);
        cats.put(cat8.name, cat8);
        cats.put(cat9.name, cat9);
        cats.put(cat10.name, cat10);

        return cats;

        //write your code here
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> setcat = new HashSet<Cat>();
        for(Map.Entry<String, Cat> gato : map.entrySet())
        {
            setcat.add(gato.getValue());
        }
        return setcat;
        //write your code here
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
