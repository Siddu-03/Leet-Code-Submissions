// Last updated: 7/6/2026, 1:44:30 PM
1class Solution {
2    public int myAtoi(String s) {
3        int i = 0;
4        int n = s.length();
5
6        // 1. Skip leading whitespaces
7        while (i < n && s.charAt(i) == ' ') {
8            i++;
9        }
10
11        // If string contains only spaces
12        if (i == n) return 0;
13
14        // 2. Check sign
15        int sign = 1;
16        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
17            if (s.charAt(i) == '-') {
18                sign = -1;
19            }
20            i++;
21        }
22
23        // 3. Convert digits
24        int result = 0;
25
26        while (i < n && Character.isDigit(s.charAt(i))) {
27            int digit = s.charAt(i) - '0';
28
29            // Overflow check
30            if (result > Integer.MAX_VALUE / 10 ||
31                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
32
33                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
34            }
35
36            result = result * 10 + digit;
37            i++;
38        }
39
40        return result * sign;
41    }
42}