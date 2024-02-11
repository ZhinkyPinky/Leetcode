public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);

        printArray(nums1);

        nums1 = new int[]{1};
        nums2 = new int[]{};
        solution.merge(nums1, 1,nums2, 0);

        printArray(nums1);

        nums1 = new int[]{0};
        nums2 = new int[]{1};
        solution.merge(nums1, 0, nums2, 1);

        printArray(nums1);

        nums1 = new int[]{4,0,0,0,0,0};
        nums2 = new int[]{1,2,3,5,6};
        solution.merge(nums1, 1, nums2, 5);

        printArray(nums1);
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j);
        }
        System.out.println();
    }
}