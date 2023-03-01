class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int s=i+1;
            int e=numbers.length-1;

            while(s<=e){
            int mid=s+(e-s)/2;
            if(numbers[mid]==target-numbers[i]){
               return new int[]{i+1,mid+1};
            }
            else if(numbers[mid]>target-numbers[i]){
                e=mid-1;
            }
                else{
                    s=mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
