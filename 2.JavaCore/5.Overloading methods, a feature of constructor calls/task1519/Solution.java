package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String line = reader.readLine();
            if (line.equals("exit")){
                reader.close();
                break;
            }

            else {
            try {
                if (line.contains(".")) {
                    print(Double.parseDouble(line));
                } else if (Short.parseShort(line) > 0 && Short.parseShort(line) < 128) {
                    print(Short.parseShort(line));
                } else if (Integer.parseInt(line) <= 0 || Integer.parseInt(line) >= 128) {
                    print(Integer.parseInt(line));
                }
            }
            catch (NumberFormatException e){
                print(line);
                }

            }
        }

        //write your code here
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
