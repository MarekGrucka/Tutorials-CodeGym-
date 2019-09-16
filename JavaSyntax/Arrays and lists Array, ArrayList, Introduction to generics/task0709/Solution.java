package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String first = strings.get(0);
        int shortest = first.length();
        int index = 0;

        for (int i = 0; i < strings.size(); i++) {

            String s = strings.get(i);
            int sl = s.length();
            if (sl < shortest) {
                shortest = sl;
                index = i;

            }

        }
        for (int i = 0; i < strings.size(); i++) {

            String s2 = strings.get(i);
            int s3 = s2.length();
            if (s3 == shortest) {
                System.out.println(strings.get(i));
            }
        }
    }
}