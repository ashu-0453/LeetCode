class Solution {
    public int passThePillow(int n, int time) {
        int p=1;
        int dir=1;
        while(time--!=0){
            if(dir==1){
                if(p==n){
                dir=-1;
                }
                p=p+dir;
            }
            else {
               if(p==1){
                dir=1;
               }
            p=p+dir; 
            }
        }
        return p;
    }
}
