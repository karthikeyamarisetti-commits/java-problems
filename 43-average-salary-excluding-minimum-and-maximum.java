// Problem 43: Average Salary Excluding Minimum and Maximum
// LeetCode Java solution

class Solution { public double average(int[] a) { int s=0,m=Integer.MAX_VALUE,x=Integer.MIN_VALUE;for(int n:a){s+=n;m=Math.min(m,n);x=Math.max(x,n);}return (double)(s-m-x)/(a.length-2); } }
