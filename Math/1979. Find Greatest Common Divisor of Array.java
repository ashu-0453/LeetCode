class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return Gcd(nums[0],nums[nums.length-1]);
    }

    public int Gcd(int a,int b){
        while(b>0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
}
