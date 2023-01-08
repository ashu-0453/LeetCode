class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
        
    }
    int search(int[] nums,int target,boolean findStart){
        int ans=-1;
        int s=0,e=nums.length-1,mid;
        while(s<=e){
            mid=e-(e-s)/2;
            if(target>nums[mid]){
                s=mid+1;
            }
            else if(target<nums[mid]){
               e=mid-1; 
            }
            else{
                ans=mid;
                if(findStart){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        } 
        return ans;
    }
}
