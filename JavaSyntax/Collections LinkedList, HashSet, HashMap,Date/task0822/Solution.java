package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<N; i++){
            list.add(Integer.parseInt(reader.readLine()));

        }
        // Create and initialize a list here
        return list;
    }
}
