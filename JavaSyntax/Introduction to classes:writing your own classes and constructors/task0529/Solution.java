package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true)
                {

                    int a;

            String s = reader.readLine();
            if (s.equals("sum"))
                break;

                 else
                 a = Integer.parseInt(s);
                 sum += a;
        }

        System.out.println(sum);



        //write your code here
    }
}
