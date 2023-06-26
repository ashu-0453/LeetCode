class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet();
        HashSet<Integer> set2=new HashSet();
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }

        HashSet<Integer> ans1=new HashSet();
        HashSet<Integer> ans2=new HashSet();

        for(int i=0;i<nums2.length;i++){
            if(!set1.contains(nums2[i])){
                ans1.add(nums2[i]);
            }
        }


        for(int i=0;i<nums1.length;i++){
            if(!set2.contains(nums1[i])){
                ans2.add(nums1[i]);
            }
        }

        List<Integer> list1=new ArrayList<>(ans2);
        List<Integer> list2=new ArrayList<>(ans1);

        list.add(list1);
        list.add(list2);

        return list;
        
    }
}
