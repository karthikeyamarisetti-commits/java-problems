// Problem 23: Find Numbers with Even Number of Digits
// LeetCode Java solution

class Solution { public int findNumbers(int[] a) { int c=0;for(int n:a){int d=0;do{d++;n/=10;}while(n!=0);if(d%2==0)c++;}return c; } }
