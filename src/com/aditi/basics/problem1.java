package com.aditi.basics;
import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {

        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 46;

        int[] ans = twoSum(arr, target);
        System.out.println("Index of target: " + Arrays.toString(ans));
    }

    static int[] twoSum(int[] arr, int target) {
        for (int i=0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
