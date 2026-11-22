// Problem 21: Running Sum of 1D Array
// LeetCode Java solution

class Solution { public int[] runningSum(int[] a) { for(int i=1;i<a.length;i++)a[i]+=a[i-1];return a; } }
