class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int sum=numBottles;
        while( numBottles / numExchange > 0){
            int quo=numBottles / numExchange;
            sum += quo;
            int rem=numBottles % numExchange;
            numBottles=(quo + rem) ;
        }
        return sum;
    }
}
