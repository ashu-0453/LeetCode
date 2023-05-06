class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();

        String[] str=s.split(" ");

        for(int i=0;i<str.length;i++){
            sb.append(new StringBuilder(str[i]).reverse());
            if(i!=str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
