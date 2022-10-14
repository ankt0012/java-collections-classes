package LinkedList;

import java.util.Scanner;

public class ReverseLinkedList {
     Node head;
    static int size=0;
    ReverseLinkedList(){
        this.head= null;
    }

    static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data= data;
            this.next=null;

        }
    }

    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next= head;
        head=newNode;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != head) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next=head;

    }
    public  static  void reverseIterate(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next= null;
        head= prevNode;

    }

    public static Node reverseRecursive(Node head){
        if(head== null || head.next==null){
            return head;
        }
        Node newhead = reverseRecursive(head.next);
        head.next.next= head;
        head.next = null;


         return newhead;
    }
    public Node exchangeNodes(Node head) {
        Node curr= head;
        while(curr.next!=head){
            curr=curr.next;
        }

        Node newNode= new Node(head.data);
        head.data=curr.data;
        curr.data=newNode.data;

        return head;
    }
    public void print(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != head) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        Scanner sc = new Scanner(System.in);
       list.add(1);
       list.add(2);
       list.add(3);

     list.print(list.head);
     //list.exchangeNodes(list.head);
        reverseRecursive(list.head);
    }
}
