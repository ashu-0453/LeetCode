class Solution {
    public boolean checkRecord(String s) {
        int countA=0;

        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A'){
                countA++;
            }
        }
        if(countA<2 && !s.contains("LLL")){
            return true;
        }

        return false;
        
    }
}
