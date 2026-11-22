# Problems 11–20 — Strings

## 11. Reverse String
```java
class Solution { public void reverseString(char[] s) { int i=0,j=s.length-1;while(i<j){char t=s[i];s[i++]=s[j];s[j--]=t;} } }
```
## 12. Length of Last Word
```java
class Solution { public int lengthOfLastWord(String s) { int i=s.length()-1,c=0;while(i>=0&&s.charAt(i)==' ')i--;while(i>=0&&s.charAt(i)!=' '){c++;i--;}return c; } }
```
## 13. Longest Common Prefix
```java
class Solution { public String longestCommonPrefix(String[] a) { if(a.length==0)return "";String p=a[0];for(int i=1;i<a.length;i++)while(!a[i].startsWith(p)){p=p.substring(0,p.length()-1);if(p.isEmpty())return "";}return p; } }
```
## 14. Valid Palindrome
```java
class Solution { public boolean isPalindrome(String s) { int i=0,j=s.length()-1;while(i<j){while(i<j&&!Character.isLetterOrDigit(s.charAt(i)))i++;while(i<j&&!Character.isLetterOrDigit(s.charAt(j)))j--;if(Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--)))return false;}return true; } }
```
## 15. Detect Capital
```java
class Solution { public boolean detectCapitalUse(String w) { return w.equals(w.toUpperCase())||w.equals(w.toLowerCase())||(Character.isUpperCase(w.charAt(0))&&w.substring(1).equals(w.substring(1).toLowerCase())); } }
```
## 16. Reverse Prefix of Word
```java
class Solution { public String reversePrefix(String w,char ch) { int k=w.indexOf(ch);return k<0?w:new StringBuilder(w.substring(0,k+1)).reverse()+w.substring(k+1); } }
```
## 17. Check If Two String Arrays Are Equivalent
```java
class Solution { public boolean arrayStringsAreEqual(String[] a,String[] b) { StringBuilder x=new StringBuilder(),y=new StringBuilder();for(String s:a)x.append(s);for(String s:b)y.append(s);return x.toString().equals(y.toString()); } }
```
## 18. Goal Parser Interpretation
```java
class Solution { public String interpret(String c) { return c.replace("()","o").replace("(al)","al"); } }
```
## 19. Defanging an IP Address
```java
class Solution { public String defangIPaddr(String a) { return a.replace(".","[.]"); } }
```
## 20. To Lower Case
```java
class Solution { public String toLowerCase(String s) { return s.toLowerCase(); } }
```
