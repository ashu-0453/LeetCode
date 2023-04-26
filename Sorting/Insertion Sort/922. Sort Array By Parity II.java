class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
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

        int x=0;
        int y=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[x]=nums[i];
                x=x+2;
            }else{
                ans[y]=nums[i];
                y=y+2;
            }
        }

    return ans;
        
    }
}
