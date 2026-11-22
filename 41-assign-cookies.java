// Problem 41: Assign Cookies
// LeetCode Java solution

class Solution { public int findContentChildren(int[] g,int[] s) { java.util.Arrays.sort(g);java.util.Arrays.sort(s);int i=0,j=0,c=0;while(i<g.length&&j<s.length){if(s[j]>=g[i]){i++;c++;}j++;}return c; } }
