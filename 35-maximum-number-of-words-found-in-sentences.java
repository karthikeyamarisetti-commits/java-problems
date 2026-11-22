// Problem 35: Maximum Number of Words Found in Sentences
// LeetCode Java solution

class Solution { public int mostWordsFound(String[] a) { int m=0;for(String s:a)m=Math.max(m,s.split(" ").length);return m; } }
