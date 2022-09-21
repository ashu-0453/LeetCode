package com.astush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter extra candies: ");
        int e = input.nextInt();
        List<Boolean> answer = kidsWithCandies(arr, e);
        System.out.println(answer);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        List<Boolean> result = new ArrayList<>(n);
        max = candies[0];
        for (int j = 1; j < n; j++) {
            if (candies[j] > max) {
                max = candies[j];
            }
        }
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

}

//    static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
//        int n = candies.length;
//        int[] sum = new int[n];
//        boolean[] result = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            sum[i] = candies[i] + extraCandies;
//            for (int j = 0; j < n; j++) {
//                if (sum[i] >= candies[j]) {
//                    result[i] = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(sum));
//        return result;
//    }

