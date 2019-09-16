package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i< list.size(); i++){
            String s = list.get(i);
            char[] array = s.toCharArray();
            char[] temp = s.toCharArray();
            int t = 0;
            int r = 0;
            int l = 0;
                        for (int a = 0; a < array.length; a++) {
                                if (array[a] == 'r') {r += 1;}
                                else if (array[a] == 'l') {l += 1;}
                                                            }
                        t= r+l;
                        if (t==2){}
                        else if (l>0) list.add(s);
                        else if (r>0) list.remove(i);
                        }
        return list;
        }




}