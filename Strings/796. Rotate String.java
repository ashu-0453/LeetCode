class Solution {
    public boolean rotateString(String s, String goal) {    //s=abcde , goal=deabc
        if(s.length()!=goal.length()){
            return false;
        }

        if(s.equals(goal)){
            return true;
        }

        if (s.length()==goal.length() && (s+s).contains(goal)){       //As for true condition, (s+s) i.e abcdeabcd will always have goal in it
            return true;
        }
        
        return false;
    }
}                               
