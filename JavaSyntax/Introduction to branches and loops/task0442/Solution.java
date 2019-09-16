package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Boolean stop = false;
        int entry = Integer.parseInt(reader.readLine());

        while (!stop){
            int number = Integer.parseInt(reader.readLine());
            entry += number;
             if (number == -1)
                System.out.println(entry);
                break;


            }



        //write your code here
    }
}
