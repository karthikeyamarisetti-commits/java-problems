# Problems 36–45 — Loop & Array Problem Solving

## 36. Two Sum (Nested Loops)
```java
class Solution { public int[] twoSum(int[] a,int t) { for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i]+a[j]==t)return new int[]{i,j};return new int[0]; } }
```
## 37. Best Time to Buy and Sell Stock
```java
class Solution { public int maxProfit(int[] a) { int min=a[0],p=0;for(int n:a){min=Math.min(min,n);p=Math.max(p,n-min);}return p; } }
```
## 38. Maximum Subarray (Basic)
```java
class Solution { public int maxSubArray(int[] a) { int c=a[0],m=a[0];for(int i=1;i<a.length;i++){c=Math.max(a[i],c+a[i]);m=Math.max(m,c);}return m; } }
```
## 39. Find Smallest Letter Greater Than Target
```java
class Solution { public char nextGreatestLetter(char[] a,char t) { for(char c:a)if(c>t)return c;return a[0]; } }
```
## 40. Height Checker
```java
class Solution { public int heightChecker(int[] a) { int[] b=a.clone();java.util.Arrays.sort(b);int c=0;for(int i=0;i<a.length;i++)if(a[i]!=b[i])c++;return c; } }
```
## 41. Assign Cookies
```java
class Solution { public int findContentChildren(int[] g,int[] s) { java.util.Arrays.sort(g);java.util.Arrays.sort(s);int i=0,j=0,c=0;while(i<g.length&&j<s.length){if(s[j]>=g[i]){i++;c++;}j++;}return c; } }
```
## 42. Can Make Arithmetic Progression From Sequence
```java
class Solution { public boolean canMakeArithmeticProgression(int[] a) { java.util.Arrays.sort(a);int d=a[1]-a[0];for(int i=2;i<a.length;i++)if(a[i]-a[i-1]!=d)return false;return true; } }
```
## 43. Average Salary Excluding Minimum and Maximum
```java
class Solution { public double average(int[] a) { int s=0,m=Integer.MAX_VALUE,x=Integer.MIN_VALUE;for(int n:a){s+=n;m=Math.min(m,n);x=Math.max(x,n);}return (double)(s-m-x)/(a.length-2); } }
```
## 44. Find the Distance Value Between Two Arrays
```java
class Solution { public int findTheDistanceValue(int[] a,int[] b,int d) { int c=0;for(int x:a){boolean ok=true;for(int y:b)if(Math.abs(x-y)<=d){ok=false;break;}if(ok)c++;}return c; } }
```
## 45. Count Items Matching a Rule
```java
class Solution { public int countMatches(java.util.List<java.util.List<String>> a,String k,String v) { int idx=k.equals("type")?0:k.equals("color")?1:2,c=0;for(java.util.List<String> item:a)if(item.get(idx).equals(v))c++;return c; } }
```
