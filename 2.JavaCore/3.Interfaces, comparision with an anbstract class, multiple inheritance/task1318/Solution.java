package com.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws Exception{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filepath = reader.readLine();
        FileInputStream file = new FileInputStream(filepath);

        while (file.available() > 0){
            int data = file.read();
            System.out.print((char)data);
        }
        file.close();
        reader.close();
        // write your code here
    }
}