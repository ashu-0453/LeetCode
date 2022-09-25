package com.astush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Target_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        int[] nums1 = new int[n];
        System.out.println("Enter the Nums array: ");
        for (int i = 0; i < n; i++) {
            nums1[i] = input.nextInt();
        }

        int[] index1 = new int[n];
        System.out.println("Enter the Index array: ");
        for (int i = 0; i < n; i++) {
            index1[i] = input.nextInt();
        }
        System.out.print("Target Array is : ");

        int[] ans=createTargetArray(nums1,index1);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int in=index.length;
        ArrayList<Integer> a=new ArrayList();
        for(int i=0;i<n;i++){
            a.add(index[i],nums[i]);
        }
        int output[]=new int[n];
        for(int i=0;i<n;i++){
            output[i]= a.get(i);
        }
        return output;
    }
}
