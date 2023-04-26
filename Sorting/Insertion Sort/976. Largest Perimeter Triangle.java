class Solution {
    public int largestPerimeter(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int t=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=t;
                }else{
                    break;
                }
            }
        }

        int max=0;

        for(int i=0;i<n-2;i++){
            if(nums[i]+nums[i+1]>nums[i+2]){
                max=nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return max;
    }
}
