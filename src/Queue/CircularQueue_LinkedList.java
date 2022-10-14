package Queue;



public class CircularQueue_LinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            this.prev=null;
        }
    }
    static class Queuee {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        public static void enQueue(int data){

            Node newNode = new Node(data);
            if(tail==null){
                tail= head=newNode;
                return;
            }

            tail.next=newNode;
            tail= newNode;
            tail.next=head;
            head.prev=tail;
        }
    }
    public static void main(String[] args) {
        Queuee list = new Queuee();
        list.enQueue(1);
        list.enQueue(2);
        list.enQueue(3);
        Node curr= Queuee.head;
        while(curr.next!= Queuee.head){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
        System.out.print(curr.data);
    }
}
