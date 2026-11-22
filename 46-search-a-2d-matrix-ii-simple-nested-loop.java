// Problem 46: Search a 2D Matrix II (Simple Nested Loop)
// LeetCode Java solution

class Solution { public boolean searchMatrix(int[][] a,int t) { for(int[] r:a)for(int n:r)if(n==t)return true;return false; } }
