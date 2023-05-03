class Solution {
    public String interpret(String command) {
        String str=command.replace("()","o");
        String ans=str.replace("(al)","al");
        return ans;
        
    }
}
