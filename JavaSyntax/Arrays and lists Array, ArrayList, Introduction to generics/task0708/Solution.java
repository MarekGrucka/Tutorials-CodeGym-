package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int longest = 0;
        int index = 0;

        for (int i = 0; i < strings.size(); i++) {

            String s = strings.get(i);
            int sl = s.length();
            if (sl > longest) {
                longest = sl;
                index = i;

            }

        }
        for (int i = 0; i < strings.size(); i++) {

            String s2 = strings.get(i);
            int s3 = s2.length();
            if (s3 == longest) {
                System.out.println(strings.get(i));
            }
        }
    }
}
