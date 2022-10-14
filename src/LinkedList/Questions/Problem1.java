package LinkedList.Questions;

import java.util.Scanner;

/*  add two linkList */
public class Problem1 {
    static Node head;
    static Node head1;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            next= null;
        }
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void add2(int data) {
        Node newNode = new Node(data);
        if (head1 == null) {
            head1 = newNode;
            return;
        }
        Node currNode = head1;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
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
    public static Node reverseRecursive1(Node head1){
        if(head1== null || head1.next==null){
            return head1;
        }
        Node newhead = reverseRecursive(head1.next);
        head1.next.next= head1;
        head1.next = null;


        return newhead;
    }

    static Node addNumber(Node first, Node second){
        first = reverseRecursive(first);
        second = reverseRecursive1(second);

        Node sum = null;
        int carry = 0;

        while( first!=null || second!=null || carry>0 )
        {
            int newVal = carry;
            if(first!=null) newVal+=first.data;
            if(second!=null) newVal+=second.data;

            carry = newVal / 10;
            newVal = newVal % 10;
            Node newNode = new Node(newVal);
            newNode.next = sum;
            sum = newNode;
            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
        }

        return sum;
    }
    public static  void printHead(Node head){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node currNode= head;
        while (currNode!=null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static  void printHead2(Node head){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node currNode= head1;
        while (currNode!=null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       Problem1 list1 = new Problem1();
       Problem1 list2 = new Problem1();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        printHead(list1.head);
        list2.add2(4);
        list2.add2(5);
        list2.add2(6);
        list2.add2(4);
        list2.add2(3);
        System.out.println();
        printHead2(list2.head);
        System.out.println();
        Node newNode = addNumber(list1.head,list2.head1);
        while(newNode!=null){
            System.out.print(newNode.data+" ");
            newNode= newNode.next;
        }
    }
}
