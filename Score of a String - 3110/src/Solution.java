public class Solution {

    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i + 1 < s.length(); i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            score += Math.abs(a - b);
        }

        return score;
    }
}