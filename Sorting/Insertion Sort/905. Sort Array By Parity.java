class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums;
        }

        int[] ans=new int[n];

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

        int k=0;
        int l=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[k]=nums[i];
                k++;
            }else{
                ans[l]=nums[i];
                l--;
            }
        }
        return ans;
    }
}
