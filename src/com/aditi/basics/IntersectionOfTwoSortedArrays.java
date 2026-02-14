package com.aditi.basics;
import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 2, 3, 3));

        int n = arr1.size();
        int m = arr2.size();

        ArrayList<Integer> result = findArrayIntersection(arr1, n, arr2, m);

        System.out.println("Intersection: " + result);
    }

    public static ArrayList<Integer> findArrayIntersection(
            ArrayList<Integer> arr1, int n,
            ArrayList<Integer> arr2, int m) {

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < n && j < m) {

            if (arr1.get(i).equals(arr2.get(j))) {
                result.add(arr1.get(i));
                i++;
                j++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                i++;
            }
            else {
                j++;
            }
        }

        return result;
    }
}
