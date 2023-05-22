class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if( ((str[i] >='A' && str[i] <='Z') || (str[i] >='a' && str[i] <='z')) &&
                    ((str[j] >='A' && str[j] <='Z') || (str[j] >='a' && str[j] <='z'))){
                char t=str[i];
                str[i]=str[j];
                str[j]=t;
                i++;
                j--;

            }
            else if( ((str[i] >='A' && str[i] <='Z') || (str[i] >='a' && str[i] <='z')) &&
                    ((str[j] < 'A') || ((str[j] > 'Z')&&(str[j] < 'a')) || (str[j] > 'z')) ){
                j--;
            }
            else {
                i++;
            }
        }
        return String.valueOf(str);
        
    }
}
