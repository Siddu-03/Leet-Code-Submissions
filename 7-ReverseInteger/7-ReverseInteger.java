// Last updated: 7/6/2026, 1:43:39 PM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4
5        while (x != 0) {
6            int digit = x % 10;
7            x /= 10;
8
9            // Check for overflow
10            if (rev > Integer.MAX_VALUE / 10 || 
11               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
12                return 0;
13            }
14
15            // Check for underflow
16            if (rev < Integer.MIN_VALUE / 10 || 
17               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
18                return 0;
19            }
20
21            rev = rev * 10 + digit;
22        }
23
24        return rev;
25    }
26}