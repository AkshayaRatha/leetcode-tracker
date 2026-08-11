// Last updated: 8/11/2026, 1:57:31 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if(head==null||head.next==null)
4        return head;
5        ListNode prev = new ListNode(-1);
6        ListNode dummy = prev;
7        dummy.next=head;
8        ListNode curr = head;
9        while(curr!=null&&curr.next!=null)
10        {
11            if(curr.val==curr.next.val)
12            {
13                while(curr.next!=null&&curr.val==curr.next.val)
14                {
15                    curr=curr.next;
16                }
17                dummy.next=curr.next;
18            }
19            else
20            {
21                dummy=dummy.next;
22            }
23            curr=curr.next;
24        }
25        return prev.next;
26    }
27}