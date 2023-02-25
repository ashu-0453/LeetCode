class Solution {

    public int search(int[] nums,int target){
        int pivot=findPivot(nums);

        //if pivot is not found then array is not rotated and normal binary search is to be executed

        if(pivot==-1){
            return binarySearch(nums,target,0, nums.length-1);
        }

        //if pivot is found, we have found 2 ascending sorted arrays
        // 3 cases

        if(nums[pivot]==target){
            return pivot;
        }

        // in this case all elements after pivot will be smaller than the start element

        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }

     int binarySearch(int[] arr,int target,int s,int end){
        while (s<=end){
            int mid=s+(end-s)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

     int findPivot(int[] arr){
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
