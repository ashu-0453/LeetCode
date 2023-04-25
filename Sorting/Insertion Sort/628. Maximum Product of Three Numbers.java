class Solution {
    public int maximumProduct(int[] nums) {
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

        int max1=nums[0]*nums[1]*nums[n-1];
        int max2=nums[n-3]*nums[n-2]*nums[n-1];

        if(max1>max2){
            return max1;
        }
        return max2;
    }
}
