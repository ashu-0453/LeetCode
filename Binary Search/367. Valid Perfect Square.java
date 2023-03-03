class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1;
        int e=num;

        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid < num) {
                s=(int)mid+1;
            }
            else {
                e=(int)mid-1;
            }
            
        }
        return false;
    }
}
