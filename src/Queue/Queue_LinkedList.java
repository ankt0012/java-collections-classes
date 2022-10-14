package Queue;

public class Queue_LinkedList {
    static class Node {
       int data;
       Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void enQueue(int data){

            Node newNode = new Node(data);
            if(tail==null){
               tail= head=newNode;
                return;
            }
            tail.next=newNode;
            tail= newNode;
        }
        public static int deQueue(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            int front = head.data;
            if(head==tail){
                tail=null;

            }
            head= head.next;

            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.deQueue();
        }
    }
}
