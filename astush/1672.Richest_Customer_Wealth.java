package com.astush;
import java.util.Arrays;
import java.util.Scanner;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        int ans = maxWealth(arr);
        System.out.println(ans);
    }


    static int maxWealth(int[][] accounts) {
        int m = accounts.length;
        int[] sum = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] = sum[i] + accounts[i][j];
            }
        }
        int max = sum[0];
        for (int i = 1; i < m; i++) {
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        return max;
    }

}
