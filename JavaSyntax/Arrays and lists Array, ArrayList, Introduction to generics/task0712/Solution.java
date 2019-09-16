package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        String first = strings.get(0);
        int shortest = first.length();
        int indexs = 0;

        for (int i = 0; i < strings.size(); i++) {

            String s = strings.get(i);
            int sl = s.length();
            if (sl < shortest) {
                shortest = sl;
                indexs = i;

            }

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

        if (indexs < index){
            System.out.println(strings.get(indexs));
        }
        else{
            System.out.println(strings.get(index));
        }
        //

    }
}