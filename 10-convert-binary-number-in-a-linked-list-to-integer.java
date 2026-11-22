// Problem 10: Convert Binary Number in a Linked List to Integer
// LeetCode Java solution

class Solution { public int getDecimalValue(ListNode h) { int n=0;while(h!=null){n=n*2+h.val;h=h.next;}return n; } }
