package com.aditi.basics;

public class SqrtUsingBST {

    public static int sqrt(int n) {

        if (n == 0 || n == 1)
            return n;

        int low = 0;
        int high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Use long to prevent overflow
            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            }
            else if (square < n) {
                ans = mid;        // store possible answer
                low = mid + 1;    // try bigger
            }
            else {
                high = mid - 1;   // try smaller
            }
        }

        return ans;   // floor value
    }

    public static void main(String[] args) {

        int number = 17;

        int result = sqrt(number);

        System.out.println("Square Root (floor): " + result);
    }
}
