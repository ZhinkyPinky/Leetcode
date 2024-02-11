import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] expectedResult = new int[]{2, 2};

        System.out.println(testRemoveElement(inputArray, val, expectedResult));

        inputArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        expectedResult = new int[]{0, 0, 1, 3, 4};

        System.out.println(testRemoveElement(inputArray, val, expectedResult));

        inputArray = new int[]{1};
        val = 1;
        expectedResult = new int[]{};

        System.out.println(testRemoveElement(inputArray, val, expectedResult));

        inputArray = new int[]{4, 5};
        val = 5;
        expectedResult = new int[]{4};

        System.out.println(testRemoveElement(inputArray, val, expectedResult));
    }

    private static boolean testRemoveElement(int[] inputArray, int val, int[] expectedResult) {
        Solution solution = new Solution();

        int k = solution.removeElement(inputArray, val);

        if (k != expectedResult.length) {
            return false;
        }

        Arrays.sort(inputArray, 0, k);

        for (int i = 0; i < expectedResult.length; i++) {
            if (inputArray[i] != expectedResult[i]) {
                System.out.println(inputArray[i]);
                System.out.println(expectedResult[i]);
                return false;
            }
        }

        return true;
    }
}