class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder sb1=new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        String s1=sb1.toString();
        
        
        StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        String s2=sb2.toString();

        
        if(s1.equals(s2)){
            return true;
        }
        return  false;
    }
}