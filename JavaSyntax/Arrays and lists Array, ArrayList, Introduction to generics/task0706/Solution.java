package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[15];
        for (int i = 0; i <ints.length; i++){
            ints[i]= Integer.parseInt(reader.readLine());
        }

        int odd = 0;
        int even= 0;

        for (int i = 0; i< ints.length; i+=2){
            even += ints[i];
        }

        for (int i = 1; i< ints.length; i+=2){
            odd += ints[i];
        }

        if (even > odd){
            System.out.println("Even-numbered houses have more residents.");
        }
        else{
            System.out.println("Odd-numbered houses have more residents.");
        }

    }
}
