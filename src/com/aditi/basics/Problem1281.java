package com.aditi.basics;

public class Problem1281 {

    public static void main(String[] args) {
        Problem1281 obj = new Problem1281();

        int n = 234;   // sample input
        int result = obj.subtractProductAndSum(n);

        System.out.println("Result: " + result);
    }

    public int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        while ( n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }

        return product - sum;
    }

}
