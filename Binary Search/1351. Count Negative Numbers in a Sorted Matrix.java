class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int n=grid[0].length;
        for(int i=0;i<grid.length;i++){
            count+=(n - binSearch(grid[i]));
        }
        return count;
    }

    public int binSearch(int[] arr){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid] < 0){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}
