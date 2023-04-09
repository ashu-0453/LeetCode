class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        int count=0;
        
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(heights[j]<heights[j-1]){
                    swap(heights,j,j-1);
                }else{
                    break;
                }
            }
        }
    for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }

        return count;
        
    }
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
