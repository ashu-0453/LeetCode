//Kadane's Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
          
          //Step-1
            sum=sum+nums[i];
              
          //Step-2
            maxi=Math.max(maxi,sum);
          
          //Step-3
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
