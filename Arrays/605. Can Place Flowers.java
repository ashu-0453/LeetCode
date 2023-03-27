class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
           if(flowerbed[i]==0){
                int previous=(i==0 || flowerbed[i-1]==0)?0:1;
                int next=(i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;
                if(previous==0 && next ==0){
                    flowerbed[i]=1;
                    count++;
                }
           }
            
        }
        if(count>=n){
            return true;
        }else{
            return false;
        }
    }
}
