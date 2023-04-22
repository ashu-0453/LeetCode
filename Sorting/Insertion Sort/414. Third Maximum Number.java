class Solution {
    public int thirdMax(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
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
        
        if(nums.length<3){
            return nums[nums.length-1];
        }
        int count=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                count++;
            }
            if(count==2){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
