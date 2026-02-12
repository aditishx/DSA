package com.aditi.basics;

import java.util.ArrayList;
import java.util.Collections;

public class GFGArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        ArrayList<Integer> ans = leaders(arr);
        System.out.println("Leaders in array: " + ans);
    }

    static ArrayList<Integer> leaders(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length - 1;
        int max = arr[n];

        list.add(max);

        for (int i=n-1; i >=0; i--) {

            if (max < arr[i] || max == arr[i]) {
                max = arr[i];
                list.add(arr[i]);

            }
        }

        Collections.reverse(list);
        return list;
    }
}
