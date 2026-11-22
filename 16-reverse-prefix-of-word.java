// Problem 16: Reverse Prefix of Word
// LeetCode Java solution

class Solution { public String reversePrefix(String w,char ch) { int k=w.indexOf(ch);return k<0?w:new StringBuilder(w.substring(0,k+1)).reverse()+w.substring(k+1); } }
