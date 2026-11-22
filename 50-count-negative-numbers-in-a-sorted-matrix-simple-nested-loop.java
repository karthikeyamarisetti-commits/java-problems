// Problem 50: Count Negative Numbers in a Sorted Matrix (Simple Nested Loop)
// LeetCode Java solution

class Solution { public int countNegatives(int[][] a) { int c=0;for(int[] r:a)for(int n:r)if(n<0)c++;return c; } }
