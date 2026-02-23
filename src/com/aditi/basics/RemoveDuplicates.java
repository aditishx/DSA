package com.aditi.basics;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr) {

        int prev = 0;

        for(int i = 1; i < arr.length; i++) {
            if (arr[prev] != arr[i]) {
                arr[++prev] = arr[i];
            }
        }

        return ++prev;

    }
}
