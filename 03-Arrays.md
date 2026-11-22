# Problems 21–35 — Basic Arrays

## 21. Running Sum of 1D Array
```java
class Solution { public int[] runningSum(int[] a) { for(int i=1;i<a.length;i++)a[i]+=a[i-1];return a; } }
```
## 22. Richest Customer Wealth
```java
class Solution { public int maximumWealth(int[][] a) { int m=0;for(int[] r:a){int s=0;for(int v:r)s+=v;m=Math.max(m,s);}return m; } }
```
## 23. Find Numbers with Even Number of Digits
```java
class Solution { public int findNumbers(int[] a) { int c=0;for(int n:a){int d=0;do{d++;n/=10;}while(n!=0);if(d%2==0)c++;}return c; } }
```
## 24. Number of Good Pairs
```java
class Solution { public int numIdenticalPairs(int[] a) { int c=0;for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i]==a[j])c++;return c; } }
```
## 25. Kids With the Greatest Number of Candies
```java
class Solution { public java.util.List<Boolean> kidsWithCandies(int[] a,int e) { int m=0;for(int n:a)m=Math.max(m,n);java.util.List<Boolean> r=new java.util.ArrayList<>();for(int n:a)r.add(n+e>=m);return r; } }
```
## 26. Shuffle the Array
```java
class Solution { public int[] shuffle(int[] a,int n) { int[] r=new int[2*n];for(int i=0;i<n;i++){r[2*i]=a[i];r[2*i+1]=a[i+n];}return r; } }
```
## 27. Concatenation of Array
```java
class Solution { public int[] getConcatenation(int[] a) { int n=a.length,r[]=new int[2*n];for(int i=0;i<n;i++){r[i]=a[i];r[i+n]=a[i];}return r; } }
```
## 28. Build Array from Permutation
```java
class Solution { public int[] buildArray(int[] a) { int[] r=new int[a.length];for(int i=0;i<a.length;i++)r[i]=a[a[i]];return r; } }
```
## 29. Find the Highest Altitude
```java
class Solution { public int largestAltitude(int[] a) { int s=0,m=0;for(int n:a){s+=n;m=Math.max(m,s);}return m; } }
```
## 30. Find Pivot Index
```java
class Solution { public int pivotIndex(int[] a) { int t=0,l=0;for(int n:a)t+=n;for(int i=0;i<a.length;i++){if(l==t-l-a[i])return i;l+=a[i];}return -1; } }
```
## 31. Plus One
```java
class Solution { public int[] plusOne(int[] a) { for(int i=a.length-1;i>=0;i--){if(a[i]<9){a[i]++;return a;}a[i]=0;}int[] r=new int[a.length+1];r[0]=1;return r; } }
```
## 32. Remove Element
```java
class Solution { public int removeElement(int[] a,int val) { int k=0;for(int n:a)if(n!=val)a[k++]=n;return k; } }
```
## 33. Move Zeroes
```java
class Solution { public void moveZeroes(int[] a) { int k=0;for(int n:a)if(n!=0)a[k++]=n;while(k<a.length)a[k++]=0; } }
```
## 34. Find the Difference of Two Arrays
```java
class Solution { public java.util.List<java.util.List<Integer>> findDifference(int[] a,int[] b) { java.util.List<Integer>x=new java.util.ArrayList<>(),y=new java.util.ArrayList<>();for(int n:a)if(!has(b,n)&&!x.contains(n))x.add(n);for(int n:b)if(!has(a,n)&&!y.contains(n))y.add(n);return java.util.Arrays.asList(x,y);}private boolean has(int[]a,int n){for(int v:a)if(v==n)return true;return false;} }
```
## 35. Maximum Number of Words Found in Sentences
```java
class Solution { public int mostWordsFound(String[] a) { int m=0;for(String s:a)m=Math.max(m,s.split(" ").length);return m; } }
```
