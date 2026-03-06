package com.aditi.Feb24.Class;

public class PivotMaximum {

    public static int findPivot(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        // If the array is not rotated
        if (arr[low] <= arr[high])
            return high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > low && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[mid] >= arr[low])
                low = mid + 1;     // pivot in right
            else
                high = mid - 1;    // pivot in left
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        int pivotIndex = findPivot(arr);

        System.out.println("Pivot Index: " + pivotIndex);
        System.out.println("Maximum Element: " + arr[pivotIndex]);
    }
}
