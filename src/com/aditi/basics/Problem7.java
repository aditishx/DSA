package com.aditi.basics;

public class Problem7 {

    public static void main(String[] args) {

        int x = 234;   // sample input
        int result = reverse(x);

        System.out.println("Result: " + result);
    }

    public static int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
            int digit=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
                return 0;
            rev=(rev*10)+digit;
            x=x/10;
        }
        return rev;
    }

}
