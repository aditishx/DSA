package com.aditi.Assignment.Feb23;

public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums, target), last(nums, target)};
    }

    private int first(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private int last(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
