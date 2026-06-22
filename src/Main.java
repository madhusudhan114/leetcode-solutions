import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] output = TwoSumSolution.twoSum(new int[]{1, 4, 6, 3, 2}, 10);
        System.out.println(Arrays.toString(output));

        boolean result = HashMapContainsDuplicates.containsDuplicate(new int[]{1, 4, 6, 3, 2});
        System.out.println(result);
    }
}