package com.astush;

import java.util.Scanner;

public class MaxPopYear {
    public static void main(String[] args) {
        int[][] logs={{1950,1961},{1960,1971},{1970,1981}};
        int ans=maximumPopulation(logs);
        System.out.println(ans);
    }
    static int maximumPopulation(int[][] logs) {
        int n=logs.length;
        int[] arr=new int[101];
        for(int i=0;i<n;i++){
            arr[logs[i][0]-1950]++;
            arr[logs[i][1]-1950]--;
        }
        for(int i=1;i<101;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        int max=arr[0];
        int max_year=1950;
        for(int i=1;i<101;i++){
            if(arr[i]>max){
                max=arr[i];
                max_year=i+1950;
            }
        }
        return max_year;
    }
}
