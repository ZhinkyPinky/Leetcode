import java.util.*;

class Solution {
    /*
    public int[] twoSum(int[] nums, int target) {
        LinkedList<Integer>[] buckets = new LinkedList[target];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < buckets.length) {
                if (buckets[nums[i]] == null) {
                    buckets[nums[i]] = new LinkedList<>();
                }

                buckets[nums[i]].add(i);
            }
        }

        int i = 0;
        int j = buckets.length - 1;
        while (true) {
            while (buckets[i] == null || i + j < target) {
                i++;
            }

            while (buckets[j] == null || i + j > target) {
                j--;
            }

            if (i + j == target) {
                return new int[]{buckets[i].getFirst(), buckets[j].getLast()};
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>(List.of(i)));
            } else {
                map.get(nums[i]).add(i);
            }
        }

        for (int i : map.keySet()) {
            if (map.containsKey(target - i)) {
                if ((target - i) == i && (map.get(i).size() >= 2)) {
                    return new int[]{map.get(i).get(0), map.get(i).get(1)};
                }

                if (map.get(i).get(0) < map.get((target - i)).get(0)) {
                    return new int[]{map.get(i).get(0), map.get((target - i)).get(0)};
                } else {
                    return new int[]{map.get((target - i)).get(0), map.get(i).get(0)};
                }
            }
        }

        return null;
    }
     */


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
