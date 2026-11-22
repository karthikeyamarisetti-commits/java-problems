// Problem 29: Find the Highest Altitude
// LeetCode Java solution

class Solution { public int largestAltitude(int[] a) { int s=0,m=0;for(int n:a){s+=n;m=Math.max(m,s);}return m; } }
