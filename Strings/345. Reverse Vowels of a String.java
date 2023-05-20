class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !isVowel(arr[i])){
                i++;
            }
            while(i<j && !isVowel(arr[j])){
                j--;
            }

            swap(arr,i,j);
            i++;
            j--;

        }
        
        return String.valueOf(arr);
    }

    public boolean isVowel(char ch){
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            return true;
        }
        return false;
    }

    public void swap(char[] arr,int a,int b){
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
