package com.aditi.March6.Class;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(maxSubarraySum(arr));
    }
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
}
