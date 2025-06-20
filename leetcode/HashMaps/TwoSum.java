package leetcode.HashMaps;

import java.util.HashMap;

public class TwoSum {
        public int[] twoSum(int[] nums, int target){
            HashMap<Integer,Integer> map = new HashMap<>();
            
            for(int i: nums){
                int complemento = target - nums[i];
                if(map.containsKey(complemento)){
                   return new int[] {map.get(complemento),i};
                } 
                map.put(nums[i], i);
            } 
            return new int[] {};
        }
}
