class Solution {
    public String toLowerCase(String s) {
      
      /* Solution - 1 */

        // String str=s.toLowerCase();
        // return str;

      
      /* Solution - 2 */

        StringBuilder sb=new StringBuilder();

        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                int n='a'-'A';
                sb.append((char)(s.charAt(i)+n));

            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
    }
}
