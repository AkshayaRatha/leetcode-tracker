// Last updated: 7/15/2026, 11:23:59 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14class Solution {
15    public ListNode deleteDuplicates(ListNode head) {
16        if (head == null || head.next == null) {
17            return head;
18        }
19
20        ListNode curr = head;
21
22        while (curr != null && curr.next != null) {
23            if (curr.val == curr.next.val) {
24                curr.next = curr.next.next;
25            }
26
27            else {
28                curr = curr.next;
29            }
30        }
31
32        return head;
33    }
34}