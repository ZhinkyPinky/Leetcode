class Solution {
    public int removeElementBoop(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            if (nums[i] == val) {
                while (k > i) {
                    if (nums[--k] != val) {
                        nums[i] = nums[k];
                        break;
                    }
                }
            }
        }

        return k;
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}