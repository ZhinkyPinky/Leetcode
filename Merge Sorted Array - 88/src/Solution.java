class Solution {
    public void merge(int[] m, int mElements, int[] n, int nElements) {
        if (nElements == 0) {
            return;
        }

        while (nElements > 0) {
            if (mElements == 0 || m[mElements - 1] <= n[nElements - 1]) {
                m[mElements + nElements - 1] = n[nElements-- - 1];
            } else {
                m[mElements + nElements - 1] = m[mElements-- - 1];
            }
        }
    }

    public void mergeeee(int[] m, int mElements, int[] n, int nElements) {
        if (nElements == 0) {
            return;
        }

        while (nElements > 0 && mElements < m.length) {
            m[mElements] = n[n.length - nElements];
            nElements--;

            for (int i = mElements; i > 0; i--) {
                if (m[i] < m[i - 1]) {
                    int temp = m[i];
                    m[i] = m[i - 1];
                    m[i - 1] = temp;
                } else {
                    break;
                }
            }

            mElements++;
        }
    }

    public void mergee(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        }

        while (m > 0) {
            nums1[nums1.length - n] = nums2[nums2.length - m];
            m--;

            for (int i = nums1.length - n; i > 0; i--) {
                if (nums1[i] < nums1[i - 1]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[i - 1];
                    nums1[i - 1] = temp;
                }
            }

            n--;
        }
    }
}
