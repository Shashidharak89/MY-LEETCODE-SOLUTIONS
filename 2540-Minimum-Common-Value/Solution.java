class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1=new TreeSet<>();
        Set<Integer> set2=new TreeSet<>();
        int i;
        for(i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(Integer ele:set1){
            if(set2.contains(ele)){
                return ele;
            }
        }
        return -1;
    }
}