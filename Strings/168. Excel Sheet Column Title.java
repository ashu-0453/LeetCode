class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();

        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            sb.append((char)('A'+ rem));
            columnNumber=(columnNumber-1)/26;
        }
        
    sb.reverse();
    return sb.toString();
    }
}
