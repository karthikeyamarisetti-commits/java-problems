// Problem 49: Lucky Numbers in a Matrix
// LeetCode Java solution

class Solution { public java.util.List<Integer> luckyNumbers(int[][] a) { java.util.List<Integer> r=new java.util.ArrayList<>();for(int i=0;i<a.length;i++){int min=a[i][0],col=0;for(int j=1;j<a[i].length;j++)if(a[i][j]<min){min=a[i][j];col=j;}boolean largest=true;for(int k=0;k<a.length;k++)if(a[k][col]>min)largest=false;if(largest)r.add(min);}return r; } }
