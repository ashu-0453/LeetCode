package com.astush;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Array: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int ans=findNumbers(arr);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums) {
        int rem=0;
        int count=0;

        for (int i=0;i<nums.length;i++){
            int c=0;
            do{
                rem=nums[i]%10;      //5
                nums[i]=nums[i]/10;  //34
                c++;
            }
            while(nums[i]!=0);
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}
