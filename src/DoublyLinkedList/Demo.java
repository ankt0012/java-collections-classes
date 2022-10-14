package DoublyLinkedList;

public class Demo {
    static Node head;
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void add(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head=newNode;
            head.prev=null;
            head.next=null;
            return;
        }
        Node curr =head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
    }
    public static void main(String[] args) {
      
       add(1);
        add(2);
        add(3);
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.prev;
        }
    }
}
