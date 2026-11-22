// Problem 25: Kids With the Greatest Number of Candies
// LeetCode Java solution

class Solution { public java.util.List<Boolean> kidsWithCandies(int[] a,int e) { int m=0;for(int n:a)m=Math.max(m,n);java.util.List<Boolean> r=new java.util.ArrayList<>();for(int n:a)r.add(n+e>=m);return r; } }
