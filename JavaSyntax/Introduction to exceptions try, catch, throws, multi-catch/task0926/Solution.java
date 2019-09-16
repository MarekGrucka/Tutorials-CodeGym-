package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] a5 = {1,2,3,4,5};
        int[] a2 = {1,2};
        int[] a4 = {1,2,3,4};
        int[] a7 = {1,2,3,4,5,6,7};
        int[] a0 = new int[0];

        list.add(a5);
        list.add(a2);
        list.add(a4);
        list.add(a7);
        list.add(a0);

        return list;
        //write your code here

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
