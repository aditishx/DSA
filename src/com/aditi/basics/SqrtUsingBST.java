package com.aditi.basics;

public class SqrtUsingBST {

    public static int sqrt(int n) {

        if (n == 0 || n == 1)
            return n;

        int start = 0;
        int end = n;
        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            }
            else if (square < n) {
                ans = mid;        // store possible answer
                start = mid + 1;    // try bigger
            }
            else {
                end = mid - 1;   // try smaller
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
