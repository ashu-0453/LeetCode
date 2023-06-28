//Not so good approach
//Best Approach :  Fermat Theorem

class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a=0;a*a <= c;a++){
            int b=c-(int)(a*a);
            if(binarySearch(0,b,b)){
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(long s,long e,int t){
        if(s>e){
            return false;
        }
        long mid=s+(e-s)/2;
        if(mid*mid == t){
            return true;
        }
        if(mid*mid > t){
            return binarySearch(s,mid-1,t);
        }

        return binarySearch(mid+1,e,t);

    }
}
