# Problems 46–50 — 2D Arrays

## 46. Search a 2D Matrix II (Simple Nested Loop)
```java
class Solution { public boolean searchMatrix(int[][] a,int t) { for(int[] r:a)for(int n:r)if(n==t)return true;return false; } }
```
## 47. Transpose Matrix
```java
class Solution { public int[][] transpose(int[][] a) { int[][] r=new int[a[0].length][a.length];for(int i=0;i<a.length;i++)for(int j=0;j<a[0].length;j++)r[j][i]=a[i][j];return r; } }
```
## 48. Matrix Diagonal Sum
```java
class Solution { public int diagonalSum(int[][] a) { int s=0,n=a.length;for(int i=0;i<n;i++){s+=a[i][i]+a[i][n-1-i];}if(n%2==1)s-=a[n/2][n/2];return s; } }
```
## 49. Lucky Numbers in a Matrix
```java
class Solution { public java.util.List<Integer> luckyNumbers(int[][] a) { java.util.List<Integer> r=new java.util.ArrayList<>();for(int i=0;i<a.length;i++){int min=a[i][0],col=0;for(int j=1;j<a[i].length;j++)if(a[i][j]<min){min=a[i][j];col=j;}boolean largest=true;for(int k=0;k<a.length;k++)if(a[k][col]>min)largest=false;if(largest)r.add(min);}return r; } }
```
## 50. Count Negative Numbers in a Sorted Matrix (Simple Nested Loop)
```java
class Solution { public int countNegatives(int[][] a) { int c=0;for(int[] r:a)for(int n:r)if(n<0)c++;return c; } }
```
