class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int t=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=t;
                }else{break;}
            }
        }
        int c=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=c){
                return c;
            }
            c++;
        }
        return c;
    }
}
