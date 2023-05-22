class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String current=words[i];
            int clen=current.length()-1;
            if(isVowel( current.charAt(0) ) && 
            isVowel( current.charAt(clen) )){
                count++;
            }
        }
        return count;
    }


    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            return true;
        }
        return false;
    }
}
