package LinkedList;

import java.util.Scanner;



public class LinkedList_tail {
    static Node head;
    static Node tail;
    public static void insertLast(int val){
        Node node = new Node(val);
        if(head== null){
            head= node;
            tail= node;
        }else {
            tail.next= node;
            tail = node;
        }
    }
    public  static  void reverseIterate(){
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

    public void print(Node head){
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur= cur.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList_tail list = new LinkedList_tail();
        //int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            insertLast(p);
        }
        reverseIterate();
        list.print(head);
    }
}
