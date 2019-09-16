package com.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 words that start with the letter "L"

*/

public class Solution {
    public static Set<String> createSet() {
       Set<String> words = new HashSet<String>();
       for (int i = 0; i<20; i++) {
           String num = String.valueOf(i);
           words.add("L"+num);

       }

    return  words;


    //write your code here

    }

    public static void main(String[] args) {

    }
}
