public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        long[][] times = new long[10][2];


        for (int i = 0; i < 10; i++) {
            times[i][0] = System.currentTimeMillis();
            for (int j = 0; j <= 1000000000; j++) {
                if (solution.isPowerOfTwo(j)) {
                    System.out.println(j);
                }
            }

            times[i][1] = System.currentTimeMillis();
        }

        long resultSum = 0;
        for (int i = 0; i < times.length; i++) {
            resultSum += times[i][1] - times[i][0];

            System.out.println("Time of run " + i + ": " + ((times[i][1] - times[i][0]) / 1000.0));

            if (i == (times.length - 1)) {
                System.out.println("Total time: " + (resultSum / 1000.0));
                System.out.println("Average time: " + ((resultSum / 10.0) / 1000.0));
            }
        }
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        while (true) {
            if (n <= 0) {
                return false;
            }

            if (n <= 2) {
                return true;
            }

            if (n % 2 != 0) {
                return false;
            }

            n = n >> 1;
        }
    }
}