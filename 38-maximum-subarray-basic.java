// Problem 38: Maximum Subarray (Basic)
// LeetCode Java solution

class Solution { public int maxSubArray(int[] a) { int c=a[0],m=a[0];for(int i=1;i<a.length;i++){c=Math.max(a[i],c+a[i]);m=Math.max(m,c);}return m; } }
