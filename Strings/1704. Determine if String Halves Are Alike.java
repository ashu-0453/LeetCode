class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        for(int i=0;i<s.length()/2;i++){
            if(check(s.charAt(i))){
                count1++;
            }
        }

        for(int i=s.length()/2;i<s.length();i++){
            if(check(s.charAt(i))){
                count2++;
            }
        }

        if(count1==count2){
            return true;
        }

        return false;
    }

    static boolean check(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
