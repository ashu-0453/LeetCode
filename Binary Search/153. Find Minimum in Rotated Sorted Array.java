class Solution {
    public int findMin(int[] nums) {
      
        return nums[findPivot(nums)+1];
    }

     static int findPivot(int[] arr){
        int s=0;
        int e= arr.length-1;
        while (s<=e){
            int mid = s + (e - s) / 2;
            //4 cases

            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]>=arr[mid]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }

        return -1;
    }
}
