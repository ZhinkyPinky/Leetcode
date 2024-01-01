import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> countMap = new HashSet<>();
        for (int n : nums) {
            if (!countMap.add(n)) {
                return true;
            }
        }

        return false;
    }
}