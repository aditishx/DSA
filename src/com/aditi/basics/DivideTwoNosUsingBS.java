package com.aditi.basics;

public class DivideTwoNosUsingBS {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        int result = divide(dividend, divisor);

        System.out.println("Quotient: " + result);
    }
    public static int divide (int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        long start = 0;
        long end = dvd;
        long ans = 0;

        while (start <= end) {
            long mid = start + (end - start);

            if (mid * dvs <= dvd) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return negative ? (int) -ans : (int) ans;
    }
}
