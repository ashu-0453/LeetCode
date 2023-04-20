class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;{
            if(nums[i]!=nums[correct]){
                int t=nums[i];
                nums[i]=nums[correct];
                nums[correct]=t;
                }else{
                    i++;
                }
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1); 
            }
        }
        return list;
    }
}
