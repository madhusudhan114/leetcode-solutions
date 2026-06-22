import java.util.HashMap;
import java.util.Map;

//Contains Duplicate (LeetCode #217)
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
class HashMapContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numsCountMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(numsCountMap.containsKey(nums[i])) {
                return true;
            }
            numsCountMap.put(nums[i], 1);
        }
        return false;
    }
}