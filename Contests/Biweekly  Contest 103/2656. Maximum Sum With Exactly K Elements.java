class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=nums[nums.length-1];
            nums[nums.length-1]+=1;
        }
        
        int sum=0;
        for(int i=0;i<ans.length;i++){
            sum+=ans[i];
        }
        return sum;
    }
}
