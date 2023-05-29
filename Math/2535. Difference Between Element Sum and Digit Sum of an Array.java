class Solution {
    public int differenceOfSum(int[] nums) {
        int sumE=0;
        int sumD=0;
        for(int i=0;i<nums.length;i++){
            sumE+=nums[i];
            while(i<nums.length && nums[i]!=0){
                int rem=nums[i]%10;
                sumD+=rem;
                nums[i]/=10;
            }
        }
        return Math.abs(sumE-sumD);
    }
}
