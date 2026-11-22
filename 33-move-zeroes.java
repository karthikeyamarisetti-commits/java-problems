// Problem 33: Move Zeroes
// LeetCode Java solution

class Solution { public void moveZeroes(int[] a) { int k=0;for(int n:a)if(n!=0)a[k++]=n;while(k<a.length)a[k++]=0; } }
