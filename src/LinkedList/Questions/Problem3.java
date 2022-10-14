package LinkedList.Questions;

public class Problem3 {
    Node head;
    Problem3(){
        this.head=null;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node curr= head;
        while(curr.next!=null){
            curr= curr.next;
        }
        curr.next=newNode;
    }
    void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode = head;
        Node curNode = head.next;
        while (curNode!=null){
            Node newNode = curNode.next;
            curNode.next= preNode;

            preNode=curNode;
            curNode=newNode;
        }
        head.next=null;
        head= preNode;
    }
    void print(){

        Node curr= head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
    }
    public static void main(String[] args) {
        Problem3  list = new Problem3();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.reverse();
        list.print();
    }
}
