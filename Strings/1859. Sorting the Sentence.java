class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        int i=0;
        String[] t=new String[str.length];
        StringBuilder sb=new StringBuilder();

        for(String xyz: str){
            t[xyz.charAt(xyz.length()-1)-'1']=xyz.substring(0,xyz.length()-1);

        }

        for (int j = 0; j < t.length-1; j++) {
            sb.append(t[j]).append(" ");

        }

        sb.append(t[t.length-1]);

        return sb.toString();
        
        
    }
}
