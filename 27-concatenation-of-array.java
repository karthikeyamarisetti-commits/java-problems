// Problem 27: Concatenation of Array
// LeetCode Java solution

class Solution { public int[] getConcatenation(int[] a) { int n=a.length,r[]=new int[2*n];for(int i=0;i<n;i++){r[i]=a[i];r[i+n]=a[i];}return r; } }
