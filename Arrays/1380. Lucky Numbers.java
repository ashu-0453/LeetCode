class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                min=Math.min(matrix[i][j],min);
            }
            list1.add(min);
        }
        
        for(int j=0;j<n;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                max=Math.max(matrix[i][j],max);
            }
            list2.add(max);
        }
       
       list1.retainAll(list2);
       return list1;
    }
}
