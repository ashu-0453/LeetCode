class Solution {
    public int countSegments(String s) {
        String s1=s.trim();
        if(s1.length()==0){
            return 0;
        }
        String[] str=s1.split("\s+");
        return str.length;
        
    }
}
