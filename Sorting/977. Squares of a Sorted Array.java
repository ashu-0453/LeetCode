class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int j=0;j<nums.length;j++){
            for(int k=j+1;j>0;j--){
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
