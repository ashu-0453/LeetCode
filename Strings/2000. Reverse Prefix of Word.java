class Solution {
    public String reversePrefix(String word, char ch) {
       char[] c=word.toCharArray();
        int index=0;
        for (int i = 0; i < word.length(); i++) {
            if (c[i]==ch){
                index=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <=index ; i++) {
            sb.append(c[index-i]);
        }

        for (int i = index+1; i < word.length(); i++) {
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
