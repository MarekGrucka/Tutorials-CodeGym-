package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s = reader.readLine();
            char[] array1 = s.toCharArray();
            char char1 = array1[0];
            char uppercase = Character.toUpperCase(char1);
            for (int i = 1; i < array1.length;){
            if (array1[i] == ' '){
                array1[i+1] = Character.toUpperCase(array1[i+1]);
            }
             i++;
            }
            String word = String.valueOf(uppercase);
                for (int i = 1; i < array1.length; i++) {
                word = word + String.valueOf(array1[i]);
            }
            System.out.println(word);






        //write your code here
    }
}
