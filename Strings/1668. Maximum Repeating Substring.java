class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String original=word;

        while(original.length()<=sequence.length()){
            if(sequence.contains(original)){
                count++;
                original+=word;
            }else{
                break;
            }
        }
        return count;
    }
}
