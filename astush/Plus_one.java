package com.astush;

import java.util.Arrays;
import java.util.Scanner;

public class Plus_one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] ans=plusOne(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] plusOne(int[] digits) {
        int n=digits.length;
        int sum=0;
        int rem=0;
        int[] result=new int[n];
        for(int i=1;i<n;i++) {
            sum = (int) (sum + digits[n - i] * Math.pow(10, (i - 1)));
        }
            for(int i=0;i<n;i++){
                rem=sum%10;
                sum=sum/10;
                result[i]=rem;
            }
            return result;
    }
}
