package com.aditi.March5;

import java.util.Scanner;

public class HWI_Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = l; j <= r ; j++) {
                A[i] = x + (i - l) * y;
            }
        }

        long sum = 0;
        long mod = 1000000007;

        for (int i = 0; i < n; i++) {
            sum = (sum + A[i]) % mod;
        }
        System.out.println(sum);
    }
}
