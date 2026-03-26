package com.aditi.March11;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(maxAverage(arr, k));
    }
    public static float maxAverage(int[] arr, int k) {
        float maxAvg = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-k; i++) {
            float currSum = 0;
            for (int j = i; j < i+k; j++) {
                currSum += arr[j];
            }
            float avg = currSum / k;

            if (maxAvg < avg) {
                maxAvg = avg;
            }
        }
        return maxAvg;
    }
    public static float maxAverage2(int[] arr, int k) {
        float sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        float maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];

            if(sum > maxSum)
                maxSum = sum;
        }
        return maxSum/k;
    }
}
