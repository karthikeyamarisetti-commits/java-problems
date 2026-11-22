// Problem 39: Find Smallest Letter Greater Than Target
// LeetCode Java solution

class Solution { public char nextGreatestLetter(char[] a,char t) { for(char c:a)if(c>t)return c;return a[0]; } }
