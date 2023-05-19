class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==1 || (numRows==1) ){
            return s;
        }
        char[] strArr=s.toCharArray();        
        String[] arr=new String[numRows];
        Arrays.fill(arr,"");

        int row=0;
        boolean down=true;
        for(int i=0;i<s.length();i++){
            arr[row]+=strArr[i];
            if(row==numRows-1){
                down=false;
            }else if(row==0){
                down=true;
            }
            if(down){
                row++;
            }else{
                row--;
            }
        }
        String str="";
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
        return str;
    }
}
