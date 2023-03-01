class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        int mid=0;
        while(l<=h){
            mid=h+(l-h)/2;
            if(x/mid==mid){
                return mid;
            }
            else if(mid>x/mid){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return h;
    }
}
