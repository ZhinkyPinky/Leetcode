import java.util.*;

class Solution {
    /*
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sA = new int[26];
        for (char c : s.toCharArray()) {
            sA[c - 97]++;
        }

        int[] tA = new int[26];
        for (char c : t.toCharArray()) {
            tA[c - 97]++;
        }

        for (int i = 0; i < sA.length; i++) {
            if (sA[i] != tA[i]) {
                return false;
            }
        }

        return true;
    }
*/

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sA = new int[26];
        for (char c : s.toCharArray()) {
            sA[c - 97]++;
        }

        for (char c : t.toCharArray()) {
            if (--sA[c - 97] < 0) {
                return false;
            }
        }

        return true;
    }

}