package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <10; i++) list.add(reader.readLine());
        int size= 0;
        int w = 0;
        int max = list.size();
        while (w < max)
        {

            String s = list.get(w);
            if (s.length() > size) size = s.length();
            else {System.out.println(w); break;}
            w++;
        }

        }

    }


