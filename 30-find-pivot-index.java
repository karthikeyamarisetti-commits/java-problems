// Problem 30: Find Pivot Index
// LeetCode Java solution

class Solution { public int pivotIndex(int[] a) { int t=0,l=0;for(int n:a)t+=n;for(int i=0;i<a.length;i++){if(l==t-l-a[i])return i;l+=a[i];}return -1; } }
