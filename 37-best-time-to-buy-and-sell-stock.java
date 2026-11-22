// Problem 37: Best Time to Buy and Sell Stock
// LeetCode Java solution

class Solution { public int maxProfit(int[] a) { int min=a[0],p=0;for(int n:a){min=Math.min(min,n);p=Math.max(p,n-min);}return p; } }
