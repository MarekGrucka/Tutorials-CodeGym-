package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> people = new HashMap<String, String>();
        people.put("1", "Marek");
        people.put("2", "Marek1");
        people.put("3", "Marek2");
        people.put("4", "Marek3");
        people.put("5", "Marek3");
        people.put("6", "Marek4");
        people.put("7", "Marek5");
        people.put("8", "Marek6");
        people.put("9", "Marek6");
        people.put("9", "Marek7");



        //write your code here

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
