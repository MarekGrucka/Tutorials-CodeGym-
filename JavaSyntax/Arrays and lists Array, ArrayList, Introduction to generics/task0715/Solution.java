package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Sam", "I", "Am");

        list.add(1,"Ham");
        list.add(3,"Ham");
        list.add(5,"Ham");

        for (String a : list) System.out.println(a);


    }
}
