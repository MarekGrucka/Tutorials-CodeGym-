package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Kowalski1", "Marek");
        map.put("Kowalski2", "Marek");
        map.put("Kowalski3", "Michał");
        map.put("Kowalski4", "Marek");
        map.put("Kowalski5", "Marek");
        map.put("Kowalski6", "Jagoda");
        map.put("Kowalski7", "Marek");
        map.put("Kowalski8", "Marek");
        map.put("Kowalski9", "Marek");
        map.put("Kowalski10", "Marek");


        return map;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        String temp = null;

        HashMap<String, String> copy = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            temp = pair.getValue();
            String key = pair.getKey();
            while (iterator.hasNext()){
                Map.Entry<String, String> compare = iterator.next();
                String comparator = compare.getValue();
                    if (comparator.equals(temp)){
                    removeItemFromMapByValue(map, comparator);
                    //map.put(key, temp);
               }

            }
           // map.put(key, temp);

        }





    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair2 : map.entrySet()) {
            String kay = pair2.getKey();
            String value = pair2.getValue();
           // System.out.println(kay + value);
        }




    }
}
