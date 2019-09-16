package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat prev = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpledate = new SimpleDateFormat("MMM d, yyyy");
        String s = reader.readLine();
        Date date = prev.parse(s);
           System.out.println(simpledate.format(date).toUpperCase());

        //write your code here
    }
}
