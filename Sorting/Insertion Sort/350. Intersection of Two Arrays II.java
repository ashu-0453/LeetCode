class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums1[j]<nums1[j-1]){
                    int t=nums1[j];
                    nums1[j]=nums1[j-1];
                    nums1[j-1]=t;
                    }else{
                        break;
                    }
                }
            }

        for(int i=0;i<m-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums2[j]<nums2[j-1]){
                    int t=nums2[j];
                    nums2[j]=nums2[j-1];
                    nums2[j-1]=t;;
                    }else{
                        break;
                    }
                }
            }


        int x=0;
        int y=0;
        while(x<n && y<m){
                if(nums1[x]==nums2[y]){
                    list.add(nums1[x]);
                    x++;
                    y++;
                }else if(nums1[x]<nums2[y]){
                    x++;
                }else{
                    y++;
                }
            }
            
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        
        return arr;
                
    }
}
