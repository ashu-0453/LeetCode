class Solution {
    public int maxPower(String s) {
        int count=0;
        int max=0;
        int len=s.length();
        char prev=' ';
        for(int i=0;i < len;i++){
            if(s.charAt(i)==prev){
                count++;
                max=Math.max(max,count);
            }else{
                count=1;
                prev=s.charAt(i);
            }
            
        }
        
        return Math.max(max,count);
    }
}
