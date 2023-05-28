class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] str=text.split(" ");
        List<String> list=new ArrayList<>();

        int i=0;
        int len= str.length;
        while(i<len){
            if(str[i].equals(first)){
                 if ( (i+1<len-1) && (str[i+1].equals(second)) ){
                    list.add(str[i+2]);
                }
            }
            i++;
        }
        return list.toArray(new String[0]);
    }
}
