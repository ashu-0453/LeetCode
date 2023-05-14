class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
         String[] str1=sentence1.split(" ");
        String[] str2=sentence2.split(" ");

        return str1.length<=str2.length?check(str1,str2):check(str2,str1);
    }

    public boolean check(String[] str1, String[] str2) {
        int len1= str1.length;
        int len2= str2.length;
        int i=0;
        int count=0;
        while(i<len1 && str1[i].equals(str2[i])){
                count++;
                i++;
            }
        while (i<len1 && str1[i].equals(str2[len2-len1+i])){
            count++;
            i++;
        }

        return count==len1;
    }
}
