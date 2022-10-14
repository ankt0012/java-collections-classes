package Queue;
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class MyQueue {
    Node head;
    Node tail;

    public MyQueue(){
        head = null;
        tail = null;
    }

    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }

    public int remove(){
        Node tmp = head;
        head = head.next;
        tmp.next = null;
        return tmp.val;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

    }

}

