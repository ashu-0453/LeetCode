class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        if(pattern.length() != word.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<word.length;i++){
            char c=pattern.charAt(i);
            String str = word[i];
            if(!map.containsKey(c)){
                if(map.containsValue(str)){
                    return false;
                }
                map.put(c,str);
            }
            else if(!map.get(c).equals(str)){
                return false;
            }

        }
        return true;
    }
}
