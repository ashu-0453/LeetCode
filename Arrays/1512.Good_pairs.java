package com.astush;

import java.util.Arrays;
import java.util.Scanner;

public class Good_pairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int ans=numIdenticalPairs(arr);
        System.out.println(ans);

    }
    static int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int count=0;
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=k;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            k++;
        }
        return count;
    }
}
