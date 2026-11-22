// Problem 26: Shuffle the Array
// LeetCode Java solution

class Solution { public int[] shuffle(int[] a,int n) { int[] r=new int[2*n];for(int i=0;i<n;i++){r[2*i]=a[i];r[2*i+1]=a[i+n];}return r; } }
