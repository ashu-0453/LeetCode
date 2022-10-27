package com.astush;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Rows: ");
        int n = in.nextInt();
        System.out.println("Columns: ");
        int m = in.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] ar : a) {
            System.out.println(Arrays.toString(ar));
        }
        int[][] ans = transpose(a);
        for (int k = 0; k < ans.length; k++) {
            for (int l = 0; l < ans[k].length; l++) {
                System.out.print(ans[k][l] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] arr=new int[m][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}
