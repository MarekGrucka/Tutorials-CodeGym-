package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
       HashMap<String, String> map = new HashMap<String, String>();
       map.put("Marek1", "Grucka" );
        map.put("Tomasz", "Grucka" );
        map.put("Dominik", "Grucka" );
        map.put("Ewa", "Grucka" );
        map.put("Waldemar", "Grucka" );
        map.put("Michał1", "Mazanek" );
        map.put("Michał2", "Marcol" );
        map.put("Michał3", "Pyzik" );
        map.put("Michał5", "Grucka" );
        map.put("Marek", "Mazanek" );


        return map;
        //write your code here

    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {

        int namecount =  0;
        for (Map.Entry<String, String> n : map.entrySet()){
            if (n.getValue()==name) namecount++;
        }

        return namecount;
        //write your code here

    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int namecount= 0;
        for (Map.Entry<String, String> n : map.entrySet()){
            if (n.getKey()==lastName) namecount++;
        }

        return namecount;
    }

    public static void main(String[] args) {

    }
}
