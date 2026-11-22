// Problem 2: Palindrome Number
// LeetCode Java solution

class Solution { public boolean isPalindrome(int x) { if(x<0)return false; int n=x,r=0; while(x>0){r=r*10+x%10;x/=10;} return n==r; } }
