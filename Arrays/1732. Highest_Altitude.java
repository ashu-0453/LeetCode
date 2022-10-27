package com.astush;

import java.util.Scanner;

public class Highest_Altitude {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }
        int ans=largestAltitude(arr);
        System.out.println("Highest Altitude is: "+ans);

    }
    static int largestAltitude(int[] gain) {
        int n=gain.length;

        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            a[0]=0;
            a[i+1]=a[i]+gain[i];
        }
        int max=a[0];
        for(int i=1;i<n+1;i++){

            if(a[i]>max ){
                max=a[i];
            }
        }
        return max;

    }
}
