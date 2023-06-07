class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long mod=1000000007;
        long A=a;
        long B=b;
        long left=Math.min(a,b);
        long right=(long) n*(Math.min(a,b));

        //GCD
        while(B>0){
            long temp=A;
            A=B;
            B=temp%B;
        }

        //LCM
        long lcm=a*b/A;

        //Binary Search
        while(left<right){
            long m=left+(right-left)/2;
            if((m/a)+(m/b)-(m/lcm) < n){
                left=m+1;
            }else{
                right=m;
            }
        }
        return (int) (left%mod);
    }
}
