import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();


        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{1, 2, 3})));
        System.out.println();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
        System.out.println();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3, 0})));
        System.out.println();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{5,9,2,-9,-9,-7,-8,7,-9,10})));
        System.out.println();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{0,2,3,4})));
    }
}