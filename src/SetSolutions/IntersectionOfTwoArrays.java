package SetSolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] findIntersectionOfTwoArrays(int[] arr1, int[] arr2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int number : arr1) {
            set1.add(Integer.valueOf(number));
        }

        for(int number : arr2) {
            set2.add(Integer.valueOf(number));
        }

        set1.retainAll(set2);
        return set1.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,4,5,6};
        int[] array2 = {2,4,6};

        int[] intersection = IntersectionOfTwoArrays.findIntersectionOfTwoArrays(array1, array2);
        System.out.println(Arrays.toString(intersection));
    }
}
