package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        double sum = 0;


        while(true) {
            double newnum = Integer.parseInt(reader.readLine());
            if(newnum == -1)
            break;


                else
            sum += newnum;
            count++;


        }

        double mean = 0.;
        mean = sum / count;
        System.out.println(mean);


        //write your code here
    }
}

