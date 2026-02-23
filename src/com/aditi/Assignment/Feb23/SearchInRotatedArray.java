package com.aditi.Assignment.Feb23;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int target = 6;
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] >= arr[start]) {
                if(target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
