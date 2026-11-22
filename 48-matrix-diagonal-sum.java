// Problem 48: Matrix Diagonal Sum
// LeetCode Java solution

class Solution { public int diagonalSum(int[][] a) { int s=0,n=a.length;for(int i=0;i<n;i++){s+=a[i][i]+a[i][n-1-i];}if(n%2==1)s-=a[n/2][n/2];return s; } }
