// Last updated: 8/24/2026, 3:09:36 PM
1class Solution {
2    public String toLowerCase(String s) {
3        String result = "";
4        for(int i = 0; i < s.length(); i++){
5            char ch = s.charAt(i);
6            if(65 <= ch && ch <= 90){
7                result += (char)(ch + 32);
8            }
9            else{
10                result += ch;
11            }
12        }
13        return result;
14    }
15}