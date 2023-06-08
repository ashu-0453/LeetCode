class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num==1){
            return false;
        }
        if(num%2 != 0){
            return false;
        }else{

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                sum+=i+num/i;
                }
            }
        }
        return sum==num?true:false;
        
    }
}
