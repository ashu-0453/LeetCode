package com.astush;

import java.util.Scanner;
import java.util.Arrays;

public class Smaller_no_than_currentNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] ans=smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;

        int[] output= new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                output[i]=count;
            }

        }
        return output;
    }
}
