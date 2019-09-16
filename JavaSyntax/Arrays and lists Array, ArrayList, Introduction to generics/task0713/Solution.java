package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> div3 = new ArrayList<Integer>();
        ArrayList<Integer> div2 = new ArrayList<Integer>();
        ArrayList<Integer> rest = new ArrayList<Integer>();

        for (int i = 0; i<20; i++) list.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < list.size(); i++){
            Integer x = list.get(i);
            if (x % 3 == 0) div3.add(x);
            if (x % 2 == 0) div2.add(x);

        }
        rest.addAll(list);
        rest.removeAll(div2);
        rest.removeAll(div3);

        printList(div3);
        printList(div2);
        printList(rest);

    }

    public static void printList(List<Integer> list) {
       for (Integer x : list) System.out.println(x);
    }
}
