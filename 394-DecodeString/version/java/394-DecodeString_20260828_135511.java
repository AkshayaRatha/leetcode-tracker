// Last updated: 8/28/2026, 1:55:11 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> countStack = new Stack<>();
4        Stack<String> stringStack = new Stack<>();
5        
6        String current = "";
7        int k = 0;
8        
9        for (char ch : s.toCharArray()) {
10            if (Character.isDigit(ch)) {
11                k = k * 10 + (ch - '0'); 
12            } 
13            else if (ch == '[') {
14                countStack.push(k);
15                stringStack.push(current);
16                k = 0;
17                current = "";
18            } 
19            else if (ch == ']') {
20                int repeat = countStack.pop();
21                String prev = stringStack.pop();
22                
23                StringBuilder temp = new StringBuilder(prev);
24                for (int i = 0; i < repeat; i++) {
25                    temp.append(current);
26                }
27                current = temp.toString();
28            } 
29            else {
30                current += ch;
31            }
32        }
33        
34        return current;
35    }
36}