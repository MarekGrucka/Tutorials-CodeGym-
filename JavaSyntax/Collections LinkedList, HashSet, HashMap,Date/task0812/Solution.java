package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i<10; i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        int seq = 1;
        int prev = -1;
        int seqaux = 1;

                for (int i = 0; i < numbers.size(); i++){
                    if (numbers.get(i) == prev) seqaux++;
                    else seqaux = 1;
                    if (seqaux > seq) {
                        seq = seqaux;
                        }



                    prev = numbers.get(i);

                }

        System.out.println(seq);
    }
}