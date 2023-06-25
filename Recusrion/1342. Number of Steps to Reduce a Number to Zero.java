class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    public int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        int rem=num%2;
        if(rem==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
