class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length(), i=0, j=0, len=0;
        
        while(i<n){
            char ch = s.charAt(i);
            while(j<=i && set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            len = Math.max(len, i-j+1);
            i++;
        }
        return len;
    }
}
