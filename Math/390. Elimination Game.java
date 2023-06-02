class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int rem=n;
        int step=1;
        boolean left=true;
        while(rem > 1){
            if(left || rem%2==1){
                head=head+step;
            }
            rem/=2;
            step*=2;
            left=!left;
        }
        return head;
    }
}
