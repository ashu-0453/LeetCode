class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(salary[j]<salary[j-1]){
                    int t=salary[j];
                    salary[j]=salary[j-1];
                    salary[j-1]=t;
                }else{
                    break;
                }
            }
        }
        
        double sum=0.00000;
        for(int i=1;i<n-1;i++){
            sum=sum+salary[i];
        }
        return sum/(n-2);
    }
}
