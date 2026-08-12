// Last updated: 8/12/2026, 2:36:08 PM
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
12    public ListNode reverseList(ListNode head) {
13        ListNode prev = null;
14        while (head != null) {
15            ListNode temp = head.next;
16            head.next = prev;
17            prev = head;
18            head = temp;
19        }
20        return prev;
21    }
22}