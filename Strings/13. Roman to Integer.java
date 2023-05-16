class Solution {
    public int romanToInt(String s) {
        int total=0;
        int prev=check(s.charAt(0));
        int current=0;

        for (int i = 1; i < s.length(); i++) {
            current=check(s.charAt(i));

            if(prev==0){
                prev=current;
            }else if (prev>=current){
                total+=prev;
                prev=current;
            }else {
                total+=current - prev;
                prev=0;
            }
        }
        total+=prev;
        return total;
    }

    public int check(char ch){
        switch (ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
