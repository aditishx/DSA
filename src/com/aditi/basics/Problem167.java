package com.aditi.basics;
import java.util.Arrays;

public class Problem167 {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("Indices (1-based): " + Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {

            int total = numbers[start] + numbers[end];

            if (total == target) {
                return new int[]{start + 1, end + 1}; // 1-based index
            }
            else if (total > target) {
                end--;
            }
            else {
                start++;
            }
        }

        return new int[]{-1, -1}; // if no solution found
    }

}
