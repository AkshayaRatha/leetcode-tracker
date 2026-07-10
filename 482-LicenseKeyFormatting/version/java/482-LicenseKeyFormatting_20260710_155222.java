// Last updated: 7/10/2026, 3:52:22 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        
4        StringBuilder sb = new StringBuilder();
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7            
8            char ch = s.charAt(i);
9            
10            if (ch != '-') {
11                
12                if (sb.length() % (k + 1) == k) {
13                    sb.append('-');
14                }
15                
16                sb.append(Character.toUpperCase(ch));
17            }
18        }
19
20        return sb.reverse().toString();
21    }
22}