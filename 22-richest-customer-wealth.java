// Problem 22: Richest Customer Wealth
// LeetCode Java solution

class Solution { public int maximumWealth(int[][] a) { int m=0;for(int[] r:a){int s=0;for(int v:r)s+=v;m=Math.max(m,s);}return m; } }
