package com.aditi.basics;

public class Problem162 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 1, 2, 1};
        int result = findPeakElement(nums);
        System.out.println("Peak Element at Index: " + result);
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;

    }
}