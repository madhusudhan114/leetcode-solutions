package HashMapSolutions;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean checkForDuplicate(int[] nums) {
        Map<Integer, Integer> numsMaps = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(numsMaps.containsKey(nums[i])) return true;
            numsMaps.put(nums[i], 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 22, 32, 15, 6, 10};
        boolean doesDuplicateExists = checkForDuplicate(nums);
        System.out.println(doesDuplicateExists);
    }
}
