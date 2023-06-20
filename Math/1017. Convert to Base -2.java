class Solution {
    public String baseNeg2(int n) {
        StringBuilder sb = new StringBuilder();
        int rem;
        int b = -2;
        if(n == 0){
            sb.append("0");
        }
        while(n != 0){
            rem = n % b;
            n /= b;
            if(rem < 0){
                rem -= b;
                n++;
            }
            sb.append(rem);
        }
        return sb.reverse().toString();
    }
}
