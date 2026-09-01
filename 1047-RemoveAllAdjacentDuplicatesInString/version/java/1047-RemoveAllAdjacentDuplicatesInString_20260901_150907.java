// Last updated: 9/1/2026, 3:09:07 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i = 0; i < s.length() ;i++){
5            if(!st.isEmpty()){
6                if(st.peek() == s.charAt(i)){
7                    st.pop();
8                }else{
9                    st.push(s.charAt(i));
10                }
11            }else{
12                st.push(s.charAt(i));
13            }
14        }
15        StringBuilder ns = new StringBuilder("");
16        while(!st.isEmpty()){
17            ns.append(st.pop());
18        }
19        return ns.reverse().toString();
20    }
21}