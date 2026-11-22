// Problem 17: Check If Two String Arrays Are Equivalent
// LeetCode Java solution

class Solution { public boolean arrayStringsAreEqual(String[] a,String[] b) { StringBuilder x=new StringBuilder(),y=new StringBuilder();for(String s:a)x.append(s);for(String s:b)y.append(s);return x.toString().equals(y.toString()); } }
