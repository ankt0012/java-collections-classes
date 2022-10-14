package LinkedList_implimentation;

class Node {
    int val;
    Node next;
    public Node(int val){
        this.val= val;
        this.next= null;
    }
}
public class Problem1 {
    public static void main(String[] args) {

    }
    public static Node insertHead(Node head, int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }
}
