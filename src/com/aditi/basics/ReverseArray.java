package com.aditi.basics;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

