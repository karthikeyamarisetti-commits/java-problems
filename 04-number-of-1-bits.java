// Problem 4: Number of 1 Bits
// LeetCode Java solution

class Solution { public int hammingWeight(int n) { int c=0;while(n!=0){c+=n&1;n>>>=1;}return c; } }
