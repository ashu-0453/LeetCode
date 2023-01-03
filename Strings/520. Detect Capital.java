class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)
        return true;
        Character ch0=word.charAt(0);
        Character ch1=word.charAt(1);
        if(Character.isLowerCase(ch0)){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        if(Character.isUpperCase(ch0) && Character.isLowerCase(ch1)){
                for(int i=2;i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }
        if(Character.isUpperCase(ch0)&& Character.isUpperCase(ch1)){
                for(int i=2;i<word.length();i++){
                    if(Character.isLowerCase(word.charAt(i))){
                        return false;
                    }
                }
            }
        return true;
    }
}
