class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();

        if(word1.length()==word2.length()){
            for(int i=0;i<word1.length();i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }else if(word1.length()<word2.length()){
            int i=0;
            for(i=0;i<word1.length();i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for (int j = i; j < word2.length(); j++) {
                sb.append(word2.charAt(j));

            }
        }else {
            int i=0;
            for(i=0;i<word2.length();i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for (int j = i; j < word1.length(); j++) {
                sb.append(word1.charAt(j));

            }
        }

        return sb.toString();
    }
}
