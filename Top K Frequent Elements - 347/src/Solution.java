class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] out = new int[k];

        //Get the range of possible values.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }
        }

        //Count the frequency of each value.
        int[] count = new int[max - min + 1];
        for (int i : nums) {
            count[i - min]++;
        }

        //Find the index of the highest value in count k times, zeroing the value at the end
        //of each outer loop. O(n) time.
        for (int i = 0; i < k; i++) {
            int highestFrequencyValue = Integer.MIN_VALUE;
            int highestFrequencyIndex = -1;
            for (int j = 0; j < count.length; j++) {
                if (count[j] > highestFrequencyValue) {
                    highestFrequencyValue = count[j];
                    highestFrequencyIndex = j;
                }
            }

            out[i] = highestFrequencyIndex + min;
            count[highestFrequencyIndex] = 0;
        }

        return out;
    }
}