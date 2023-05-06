class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;

        char[] mv=moves.toCharArray();
        if(moves.length()%2 == 0){
            for(char ch:mv){
                if(ch=='R'){
                    x++;

                }else if(ch=='L'){
                    x--;
                }else if(ch=='U'){
                    y++;
                }else{
                    y--;
                }
            }
            return x==0&&y==0?true:false;

        }

        return false;
    }
}
