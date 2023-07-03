class Solution {
    public int sumOfUnique(int[] nums) {
        int count;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            count = 1;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j] && i != j){
                    count++;
                    break;
                }
            }
            if(count==1){
                sum+=nums[i];
            }
        }

        return sum;
        
    }
}
