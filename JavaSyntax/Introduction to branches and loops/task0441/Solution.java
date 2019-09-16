package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int a = Integer.parseInt(n1);

        String n2 = reader.readLine();
        int b = Integer.parseInt(n2);

        String n3 = reader.readLine();
        int c = Integer.parseInt(n3);

        if (a>b && a>c)
            System.out.println(a);
            else if (b>a && b>c)
            System.out.println(b);
            else
            System.out.println(c);





        //write your code here
    }
}
