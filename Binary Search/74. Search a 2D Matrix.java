class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
        
    }

    boolean binarySearch(int[][] arr,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return true;
            }else if(arr[row][mid]>target){
                cEnd=mid-1;
            }else{
                cStart=mid+1;
            }
        }
        return false;
    }

    boolean search(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        if(rows==1){
            return binarySearch(arr,0,0,cols-1,target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        while(rStart < (rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;

            if(arr[mid][cMid]==target){
                return true;
            }
            else if(arr[mid][cMid]>target){
                rEnd=mid;
            }else{
                rStart=mid;
            }
        }

        if(arr[rStart][cMid]==target){return true;}
        if(arr[rStart+1][cMid]==target){return true;}


        if(target < arr[rStart][cMid]){
            return binarySearch(arr,rStart,0,cMid,target);
        }

        if((target > arr[rStart][cMid]) && (target <= arr[rStart][cols-1])){
            return binarySearch(arr,rStart,cMid,cols-1,target);
        }

        if(target < arr[rStart+1][cMid]){
            return binarySearch(arr,rStart+1,0,cMid,target);
        }
        else{
            return binarySearch(arr,rStart+1,cMid+1,cols-1,target);
        }
    }
}
