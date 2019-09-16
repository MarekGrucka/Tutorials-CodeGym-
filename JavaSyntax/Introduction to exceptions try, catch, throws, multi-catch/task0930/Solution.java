package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        int[] numindexes = new int[array.length];
        int[] numarray = new int[array.length];
        int[] stringindexes = new int[array.length];
        String[] stringarray = new String[array.length];

        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i< array.length; i++){

            if (isNumber(array[i])){

                numindexes[counter1] = i;
                numarray[counter1] = Integer.parseInt(array[i]);
                counter1++;
            }
            else{

                stringindexes[counter2] = i;
                stringarray[counter2]= array[i];
                counter2++;
            }

            }
        int[] numssorted = new int[numarray.length];
        Arrays.sort(numarray);
            for(int i = 0; i< numarray.length; i++){
            numssorted[i] = numarray[numarray.length-i-1];
        }

        //skrócenie listy
        int sortedlength = 0;
        for (String e :stringarray){
            if (e == null) sortedlength++;
        }
/*
            String[] sorted = new String[sortedlength];
            int o = 0;
            for (int i = 0; i< sortedlength; i++){
                o = i;
                for (; o < sortedlength; o++ ){
                    if (isGreaterThan(stringarray[i], stringarray[o])){
                       sorted[sorted.length-1-i]= stringarray[i];
                        System.out.println("dziala");
                    }
                }
            }

 */
            for (int i = 0; i < numindexes.length; i++) {
                array[numindexes[i]] = String.valueOf(numssorted[i]);
            }

 /*
            for (int i = 0; i < sorted.length; i++)
            {
                array[stringindexes[i]] = sorted[i];
            }
 */
           // for (String e : stringarray) System.out.println(e);
        System.out.println(sortedlength);

    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
