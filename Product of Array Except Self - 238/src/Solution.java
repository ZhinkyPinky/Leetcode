import java.awt.*;
import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];

        System.out.println(Arrays.toString(nums));

        //Find the index of zero in the input.
        int zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //If the input contains more than 2 zeros the output will be all zeros.
                if (zeroIndex != -1) {
                    return out;
                }

                zeroIndex = i;
            }
        }

        if (zeroIndex == -1) {
            zeroIndex = out.length - 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != zeroIndex) {
                if (out[zeroIndex] == 0) {
                    out[zeroIndex] += nums[i];
                } else {
                    out[zeroIndex] *= nums[i];
                }
            }
        }

        //If there's a zero in the input we're done at this stage.
        if (nums[zeroIndex] == 0) {
            return out;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != zeroIndex) {
                out[i] = divide((out[zeroIndex] * nums[zeroIndex]), nums[i]);
            }
        }

        return out;
    }

    /*
    static int divide(int dividend, int divisor) {
        if (dividend == 0)
            return 0;
        if (divisor == 0) {
            System.out.println("Division by 0 is impossible");
            return Integer.MAX_VALUE;
        }


        boolean sign = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (divisor == 1) {
            return ((!sign) ? dividend : -dividend);
        }

        int ans = (int) (Math.exp(Math.log(dividend) - Math.log(divisor)) + 0.0000000001);
        return ((!sign) ? ans : -ans);
    }

     */


    private int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int msb = 0;
        while ((divisor >>> msb) > 0) {
            msb++;
        }

        int temp = 0;
        int quotient = 0;
        for (int i = 31 - msb; i >= 0; --i) {
            if (temp + (divisor << i) <= dividend) {
                temp += divisor << i;
                quotient |= 1 << i;
            }
        }


        if (sign == -1) {
            quotient = -quotient;
        }

        return quotient;
    }
}