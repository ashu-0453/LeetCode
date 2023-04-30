class Solution {
    public double trimMean(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }else{
                    break;
                }
            }
        }
        
        double sum=0.00000;
        int s=arr.length/20;  //Smallest 5%
        int l=arr.length-s;   //Largest 5%
        
        for(int i=s;i<l;i++){
            sum+=(double)arr[i];
        }
        double avg=(double) sum/(arr.length-(2*s));
        return avg;
    }
}
