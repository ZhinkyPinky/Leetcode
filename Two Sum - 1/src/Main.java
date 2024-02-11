import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(testTwoSum(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}));
        System.out.println(testTwoSum(new int[]{3, 2, 4}, 6, new int[]{1, 2}));
        System.out.println(testTwoSum(new int[]{3, 3}, 6, new int[]{0, 1}));
    }

    private static boolean testTwoSum(int[] inputArray, int target, int[] expectedOutputArray) {
        Solution solution = new Solution();
        int[] outputArray = solution.twoSum(inputArray, target);

        return Arrays.equals(outputArray, expectedOutputArray);
    }
}