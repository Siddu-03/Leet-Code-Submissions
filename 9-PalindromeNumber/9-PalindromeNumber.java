// Last updated: 7/7/2026, 10:02:53 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        // Negative numbers and numbers ending with 0 (except 0 itself)
4        // cannot be palindromes.
5        if (x < 0 || (x % 10 == 0 && x != 0)) {
6            return false;
7        }
8
9        int reversedHalf = 0;
10
11        while (x > reversedHalf) {
12            reversedHalf = reversedHalf * 10 + x % 10;
13            x /= 10;
14        }
15
16        // For even digits: x == reversedHalf
17        // For odd digits: x == reversedHalf / 10 (middle digit ignored)
18        return x == reversedHalf || x == reversedHalf / 10;
19    }
20}