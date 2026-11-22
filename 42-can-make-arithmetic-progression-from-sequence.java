// Problem 42: Can Make Arithmetic Progression From Sequence
// LeetCode Java solution

class Solution { public boolean canMakeArithmeticProgression(int[] a) { java.util.Arrays.sort(a);int d=a[1]-a[0];for(int i=2;i<a.length;i++)if(a[i]-a[i-1]!=d)return false;return true; } }
