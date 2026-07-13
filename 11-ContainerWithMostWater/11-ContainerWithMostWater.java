// Last updated: 7/13/2026, 9:42:00 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6        
7        while (left < right) {
8            // Calculate current area
9            int currentArea = Math.min(height[left], height[right]) * (right - left);
10            maxArea = Math.max(maxArea, currentArea);
11            
12            // Move the pointer pointing to the shorter line
13            if (height[left] < height[right]) {
14                left++;
15            } else {
16                right--;
17            }
18        }
19        
20        return maxArea;
21    }
22}