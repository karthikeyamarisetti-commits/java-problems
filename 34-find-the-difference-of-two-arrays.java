// Problem 34: Find the Difference of Two Arrays
// LeetCode Java solution

class Solution { public java.util.List<java.util.List<Integer>> findDifference(int[] a,int[] b) { java.util.List<Integer>x=new java.util.ArrayList<>(),y=new java.util.ArrayList<>();for(int n:a)if(!has(b,n)&&!x.contains(n))x.add(n);for(int n:b)if(!has(a,n)&&!y.contains(n))y.add(n);return java.util.Arrays.asList(x,y);}private boolean has(int[]a,int n){for(int v:a)if(v==n)return true;return false;} }
