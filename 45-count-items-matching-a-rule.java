// Problem 45: Count Items Matching a Rule
// LeetCode Java solution

class Solution { public int countMatches(java.util.List<java.util.List<String>> a,String k,String v) { int idx=k.equals("type")?0:k.equals("color")?1:2,c=0;for(java.util.List<String> item:a)if(item.get(idx).equals(v))c++;return c; } }
