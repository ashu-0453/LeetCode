package com.astush;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=input.nextInt();
        int[] arr=new int[2*n];
        System.out.println("Enter "+2*n+" elements: ");
        for (int i=0;i<2*n;i++) {
            arr[i] = input.nextInt();
        }
        int[] answer=shuffle(arr,n);
        System.out.println(Arrays.toString(answer));

    }
    static int[] shuffle(int[] nums,int n){
        int[] ans=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[j];
            ans[i+1]=nums[n+j];
            j++;
        }
        return ans;
    }
}
