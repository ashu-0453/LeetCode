class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=intervals.length;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(i!=j){
                    if(intervals[i][0]>=intervals[j][0] && intervals[j][1] >= intervals[i][1]){
                        count--;
                        break;
                    }
                }
            }
        }return count;
        
    }
}
