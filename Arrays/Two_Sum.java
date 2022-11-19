package com.astush;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    static int[] twoSum(int[] nums, int target) {
        int sum=0;
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum=nums[j]+nums[j-i];
                if(target == sum)
                    return new int[]{j-i,j};
                }
            }
        return null;
    }
}
