// Last updated: 8/17/2026, 3:06:42 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode oddEvenList(ListNode head) {
13        if(head == null || head.next == null)return head;
14        ListNode odd = new ListNode(0);
15        ListNode odd_ptr = odd;
16        ListNode even = new ListNode(0);
17        ListNode even_ptr = even;
18        int idx = 1;
19        while(head != null){
20            if(idx % 2 == 0){
21                even_ptr.next = head;
22                even_ptr = even_ptr.next;
23            }else{
24                odd_ptr.next = head;
25                odd_ptr = odd_ptr.next;
26            }
27            head = head.next;
28            idx++;
29        }
30        even_ptr.next = null;
31        odd_ptr.next = even.next; 
32        return odd.next;
33    }
34}