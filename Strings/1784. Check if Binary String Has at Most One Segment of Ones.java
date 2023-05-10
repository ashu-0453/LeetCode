class Solution {
    public boolean checkOnesSegment(String s) {
        String[] str=s.split("0");
        if(str.length==1){
            return true;
        }
        return false;
    }
}
