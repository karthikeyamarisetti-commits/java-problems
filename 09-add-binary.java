// Problem 9: Add Binary
// LeetCode Java solution

class Solution { public String addBinary(String a,String b) { StringBuilder s=new StringBuilder();int i=a.length()-1,j=b.length()-1,c=0;while(i>=0||j>=0||c>0){int v=c;if(i>=0)v+=a.charAt(i--)-'0';if(j>=0)v+=b.charAt(j--)-'0';s.append(v%2);c=v/2;}return s.reverse().toString();} }
