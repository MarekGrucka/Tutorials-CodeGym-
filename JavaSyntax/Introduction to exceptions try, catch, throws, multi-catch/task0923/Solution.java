package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        char[] chars = line.toCharArray();

        char[] vov = new char[line.length()*2];
        char[] nonvov = new char[line.length()*2];
        int vovindex= 0;
        int nonvovindex= 0;

        for(int i = 0; i<chars.length; i++)
        {
            if (isVowel(chars[i])){
                vov[vovindex] = chars[i];
                vovindex++;
                vov[vovindex] = ' ';
                vovindex++;
             }
            else{
                if (chars[i] != ' '){
                nonvov[nonvovindex] = chars[i];
                nonvovindex++;
                nonvov[nonvovindex] = ' ';
                nonvovindex++;}

            }

        }
        char[] vovtemp = new char[vovindex];
        for (int i = 0; i< vovtemp.length; i++){
            vovtemp[i] = vov[i];
        }
        char[] nonvovtemp = new char[nonvovindex];
        for (int i = 0; i< nonvovtemp.length; i++){
            nonvovtemp[i] = nonvov[i];
        }

        String stringvov = new String();
        String stringnonvov = new String();
        for(char a : vovtemp) {
            stringvov = stringvov + String.valueOf(a);
        }
        for(char a : nonvovtemp) {
            stringnonvov = stringnonvov + String.valueOf(a);
        }
        //System.out.println(vov.length);
        //System.out.println(vovtemp.length);
        System.out.println(stringvov);
        System.out.println(stringnonvov);


        // write your code here
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}