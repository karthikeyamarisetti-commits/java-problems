// Problem 28: Build Array from Permutation
// LeetCode Java solution

class Solution { public int[] buildArray(int[] a) { int[] r=new int[a.length];for(int i=0;i<a.length;i++)r[i]=a[a[i]];return r; } }
