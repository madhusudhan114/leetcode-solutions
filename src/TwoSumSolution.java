//The Problem: Given an array of integers, find two numbers that add up to a specific target number and return their indices.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                return new int[] {i, numsMap.get(target - nums[i])};
            }
            numsMap.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] output = TwoSumSolution.twoSum(new int[]{1, 4, 6, 3, 2}, 10);
        System.out.println(Arrays.toString(output));
    }
}
