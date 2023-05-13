class Solution {
    public int numSub(String s) {
        int count=0;
        int ans=0;
        int mod= (int) (Math.pow(10,9)+7);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                count++;
                ans=(ans+count)% mod;
            }else{
                count=0;
            }

        }
        return ans ;
    }
}
