// Problem 5: Count Digits That Divide a Number
// LeetCode Java solution

class Solution { public int countDigits(int n) { int x=n,c=0;while(n>0){int d=n%10;if(d!=0&&x%d==0)c++;n/=10;}return c; } }
