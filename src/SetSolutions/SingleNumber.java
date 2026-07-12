package SetSolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//136
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
public class SingleNumber {
    public int findSingleNumberUsingSet(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int number : nums) {
            if(!numsSet.add(number)) {
                numsSet.remove(number);
            }
        }

        // Auto-unboxing converts Integer to int automatically
        return numsSet.iterator().next();
    }

    public int findSingleNumberUsingXOR(int[] nums) {
        int xoredValue = 0;
        for(int number : nums) {
            xoredValue = xoredValue ^ number;
        }

        return xoredValue;
    }

    public static void main(String args[]) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        int uniqueNumberSet = singleNumber.findSingleNumberUsingSet(nums);
        int uniqueNumberXOR = singleNumber.findSingleNumberUsingXOR(nums);
        System.out.println(uniqueNumberSet);
        System.out.println(uniqueNumberXOR);
    }
}
