import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        List<Integer> li=new ArrayList<>();
        int i=0;
        for(i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(Integer it:map.keySet()){
            if(map.get(it)>nums.length/3){
                li.add(it);
            }
        }
        return li;
    }
    
}