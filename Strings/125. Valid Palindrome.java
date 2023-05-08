class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[ `!\\[\\]@#$%^&*()_+\\-={}\"|;:',<.>/?]*","");
        String string=str.toLowerCase();
        StringBuilder sb=new StringBuilder();

        String original= String.valueOf(sb.append(string));
        String reversed=String.valueOf(sb.reverse());

        if(original.equals(reversed)){
            return true;
        }

        return false;
    }
}
