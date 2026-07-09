// Last updated: 7/9/2026, 9:15:53 AM
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            Node c = map.get(temp);
            c.next = map.get(temp.next);
            c.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}