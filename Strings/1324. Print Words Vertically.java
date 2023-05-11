class Solution {
    public List<String> printVertically(String s) {
        List<String> list=new ArrayList<>();
        String[] arr = s.split(" ");
        int max=arr[0].length();
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i].length());
        }

        for (int i = 0; i < max; i++) {
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                if(i>=arr[j].length()){
                    sb.append(" ");
                }else{
                    sb.append(arr[j].charAt(i));
                }
            }
            list.add(trim(sb.toString()));
        }



        return list;
        
    }

    public String trim(String str){
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                return str.substring(0,i+1);
            }
        }
        return null;
    }
}
