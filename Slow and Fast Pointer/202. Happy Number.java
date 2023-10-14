class Solution {

    //Slow and Fast Pointer method

    public int findSquare(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
       int slow=n;
       int fast=n;

       do{
           slow=findSquare(slow);
           fast=findSquare(findSquare(fast));
       }while(slow!=fast);

       if(slow==1){
           return true;
       }
       return false;
    }
    
}
