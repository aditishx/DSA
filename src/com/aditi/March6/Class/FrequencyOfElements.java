package com.aditi.March6.Class;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 3, 2, 4, 4, 7, 2};

        HashMap<Integer, Integer> result = findFrequency(arr);

        for(int key : result.keySet()) {
            System.out.println(key + " -> " + result.get(key));
        }
    }
    public static HashMap<Integer, Integer> findFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num = 0; num < arr.length; num++) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map;
    }
}
