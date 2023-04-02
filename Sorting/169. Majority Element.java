class Solution {
    public int majorityElement(int[] nums) {
        sort(nums);
        int ans=nums[0];
        int count=1;
        int max=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count+=1;
                if(count >= max && count >= nums.length/2){
                    max=count;
                    ans=nums[i];
                }
            }
            else{
                count=1;
            }
        }
    return ans; 
}       

    public int[] sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return nums;
    }
}
