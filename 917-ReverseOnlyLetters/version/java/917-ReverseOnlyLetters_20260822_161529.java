// Last updated: 8/22/2026, 4:15:29 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] ch = s.toCharArray();
4        StringBuilder letters = new StringBuilder();
5        for (char c : ch) {
6            if (Character.isLetter(c)) {
7                letters.append(c);
8            }
9        }
10        letters.reverse();
11        int index = 0;
12        for (int i = 0; i < ch.length; i++) {
13            if (Character.isLetter(ch[i])) {
14                ch[i] = letters.charAt(index++);
15            }
16        }
17        return new String(ch);
18    }
19}