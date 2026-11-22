// Problem 1: Fizz Buzz
// LeetCode Java solution

class Solution { public java.util.List<String> fizzBuzz(int n) { java.util.List<String> a=new java.util.ArrayList<>(); for(int i=1;i<=n;i++) a.add(i%15==0?"FizzBuzz":i%3==0?"Fizz":i%5==0?"Buzz":String.valueOf(i)); return a; } }
