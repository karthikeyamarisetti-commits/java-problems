// Problem 44: Find the Distance Value Between Two Arrays
// LeetCode Java solution

class Solution { public int findTheDistanceValue(int[] a,int[] b,int d) { int c=0;for(int x:a){boolean ok=true;for(int y:b)if(Math.abs(x-y)<=d){ok=false;break;}if(ok)c++;}return c; } }
