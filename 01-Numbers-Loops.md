# Problems 1–10 — Numbers, Conditions & Loops

> LeetCode-style Java method snippets. Add imports when required.

## 1. Fizz Buzz
```java
class Solution { public java.util.List<String> fizzBuzz(int n) { java.util.List<String> a=new java.util.ArrayList<>(); for(int i=1;i<=n;i++) a.add(i%15==0?"FizzBuzz":i%3==0?"Fizz":i%5==0?"Buzz":String.valueOf(i)); return a; } }
```
## 2. Palindrome Number
```java
class Solution { public boolean isPalindrome(int x) { if(x<0)return false; int n=x,r=0; while(x>0){r=r*10+x%10;x/=10;} return n==r; } }
```
## 3. Add Digits
```java
class Solution { public int addDigits(int n) { while(n>=10){int s=0;while(n>0){s+=n%10;n/=10;}n=s;}return n; } }
```
## 4. Number of 1 Bits
```java
class Solution { public int hammingWeight(int n) { int c=0;while(n!=0){c+=n&1;n>>>=1;}return c; } }
```
## 5. Count Digits That Divide a Number
```java
class Solution { public int countDigits(int n) { int x=n,c=0;while(n>0){int d=n%10;if(d!=0&&x%d==0)c++;n/=10;}return c; } }
```
## 6. Number of Steps to Reduce a Number to Zero
```java
class Solution { public int numberOfSteps(int n) { int c=0;while(n>0){n=n%2==0?n/2:n-1;c++;}return c; } }
```
## 7. Find Common Factors
```java
class Solution { public int commonFactors(int a,int b) { int c=0;for(int i=1;i<=Math.min(a,b);i++)if(a%i==0&&b%i==0)c++;return c; } }
```
## 8. Count Digits That Divide a Number
```java
class Solution { public int countDigits(int n) { int x=n,c=0;while(n>0){int d=n%10;if(d!=0&&x%d==0)c++;n/=10;}return c; } }
```
## 9. Add Binary
```java
class Solution { public String addBinary(String a,String b) { StringBuilder s=new StringBuilder();int i=a.length()-1,j=b.length()-1,c=0;while(i>=0||j>=0||c>0){int v=c;if(i>=0)v+=a.charAt(i--)-'0';if(j>=0)v+=b.charAt(j--)-'0';s.append(v%2);c=v/2;}return s.reverse().toString();} }
```
## 10. Convert Binary Number in a Linked List to Integer
```java
class Solution { public int getDecimalValue(ListNode h) { int n=0;while(h!=null){n=n*2+h.val;h=h.next;}return n; } }
```
