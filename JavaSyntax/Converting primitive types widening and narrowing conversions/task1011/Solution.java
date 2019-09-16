package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        
        String s = "I do not want to learn Java. I want a big salary";
        for (int i = 0; i<43; i++){
            char[] ch = s.toCharArray();
            for (int l = i; l<ch.length; l++){
                System.out.print(ch[l]);

            }
            System.out.println();
            }

        //write your code here
    }

}

