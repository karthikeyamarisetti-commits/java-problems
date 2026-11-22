// Problem 40: Height Checker
// LeetCode Java solution

class Solution { public int heightChecker(int[] a) { int[] b=a.clone();java.util.Arrays.sort(b);int c=0;for(int i=0;i<a.length;i++)if(a[i]!=b[i])c++;return c; } }
