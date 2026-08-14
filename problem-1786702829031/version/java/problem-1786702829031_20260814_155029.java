// Last updated: 8/14/2026, 3:50:29 PM
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
12    public ListNode reverse(ListNode head){
13        ListNode prev=null;
14        ListNode curr=head;
15        while(curr!=null){
16            ListNode next=curr.next;
17            curr.next=prev;
18            prev=curr;
19            curr=next;
20        }return prev;
21    }
22    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
23     ListNode list1=reverse(l1);
24     ListNode list2=reverse(l2);
25     int sum=0;
26     ListNode head=new ListNode();
27     ListNode temp=head;
28    int carry=0;
29     while(list1!=null || list2!=null|| carry!=0){
30        sum=carry;
31        if(list1!=null){
32            sum+=list1.val;
33            list1=list1.next;
34        }
35        if(list2!=null){
36            sum+=list2.val;
37            list2=list2.next;
38        }
39        carry=sum/10;
40        temp.next=new ListNode(sum%10);
41        temp=temp.next;
42     }return reverse(head.next);
43    }
44}