package com.aditi.basics;

public class NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 70;

        System.out.println("Element is at index: " + search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start);

            if (arr[mid] == target) {
                return mid;
            }
            if ((mid - 1) >= start && arr[mid - 1] == target) {
                return mid-1;
            }
            if ((mid + 1) <= end && arr[mid + 1] == target) {
                return mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }
}
