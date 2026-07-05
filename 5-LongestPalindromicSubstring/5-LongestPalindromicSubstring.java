// Last updated: 7/5/2026, 1:35:48 PM
class Solution {

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return "";

        StringBuilder sb = new StringBuilder("^");

        for (char c : s.toCharArray()) {
            sb.append("#").append(c);
        }

        sb.append("#$");

        char[] arr = sb.toString().toCharArray();

        int[] p = new int[arr.length];

        int center = 0;
        int right = 0;

        int maxLen = 0;
        int centerIndex = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            int mirror = 2 * center - i;

            if (i < right)
                p[i] = Math.min(right - i, p[mirror]);

            while (arr[i + 1 + p[i]] == arr[i - 1 - p[i]])
                p[i]++;

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen) / 2;

        return s.substring(start, start + maxLen);
    }
}