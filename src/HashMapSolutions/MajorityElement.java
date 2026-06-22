package HashMapSolutions;

//Majority Element (LeetCode #169)
//The Problem: The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        // Handle basic safety edge cases
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // Integer threshold: e.g., 6 / 2 = 3. Any count > 3 wins.
        int majorityTrigger = nums.length / 2;
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int num : nums) {
            int updatedCount = numsMap.getOrDefault(num, 0) + 1;
            numsMap.put(num, updatedCount);

            // Early exit check using the pre-calculated count
            if (updatedCount > majorityTrigger) {
                return num;
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 1, 4, 1, 1, 2};
        int majortyElement = findMajorityElement(nums);
        System.out.println(majortyElement);
    }
}
