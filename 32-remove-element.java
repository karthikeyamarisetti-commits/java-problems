// Problem 32: Remove Element
// LeetCode Java solution

class Solution { public int removeElement(int[] a,int val) { int k=0;for(int n:a)if(n!=val)a[k++]=n;return k; } }
