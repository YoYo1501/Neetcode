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
          if(head == null) return null;
        HashMap<Node, Node> oldToNew = new HashMap<>();
        Node p = head;
        while(p != null){
            Node newNode = new Node(p.val);
            oldToNew.put(p, newNode);
            p = p.next;
        }
        p = head;
        while(p!=null){
            Node newNode = oldToNew.get(p);
            newNode.next = oldToNew.get(p.next);
            newNode.random = oldToNew.get(p.random);
             p = p.next;
        }



        return oldToNew.get(head);
    }
}
