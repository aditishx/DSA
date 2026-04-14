package com.aditi.April14;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        print1ToN(5);
        System.out.println(fibonacci(5));
    }
    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void print1ToN(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        print1ToN(n - 1);
        System.out.print(n + " ");
    }
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}