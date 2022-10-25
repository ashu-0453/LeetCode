package com.astush;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Size of square matrix");
        int x=input.nextInt();
        int[][] m=new int[x][x];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                m[i][j]=input.nextInt();
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        for (int[] ar:m) {
            System.out.println(Arrays.toString(ar));
        }
        int ans=diagonalSum(m);
        System.out.println(ans);

    }
        static int diagonalSum(int[][] mat) {
            int sum=0;
            int p=0,s=0,c=0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    if(i==j){
                        p=p+mat[i][j];
                    }
                    if(i+j==mat.length-1){
                        s=s+mat[i][j];
                    }
                    if(i+j==mat.length-1 && i==j){
                        c=c+mat[i][j];
                    }
                    sum=p+s-c;
                }
            }
            return sum;
    }
}
