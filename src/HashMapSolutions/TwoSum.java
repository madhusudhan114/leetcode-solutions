package HashMapSolutions;

//Two Sum (LeetCode #1)
//The Problem: Given an array of integers, find two numbers that add up to a specific target number and return their indices.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) return new int[0];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int desiredNumber = target - nums[i];
            Integer complementIndex = numsMap.get(desiredNumber);
            if(complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            numsMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 2, 32, 56, 78};
        int target = 34;
        int[] indecies = findTwoSum(nums, target);
        System.out.println(Arrays.toString(indecies));
    }
}
