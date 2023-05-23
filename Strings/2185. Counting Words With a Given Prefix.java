class Solution {
    public int prefixCount(String[] words, String pref) {
       int pLen=pref.length();
        int count=0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()<pLen){
                continue;
            }
            String sub=words[i].substring(0,pLen);
            if(sub.equals(pref)){
                count++;
            }
        }
        return count; 
    }
}
