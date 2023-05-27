class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        String str=s.substring(1,len)+s.substring(0,len-1);

        return str.contains(s);
    }
}
