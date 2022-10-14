package LinkedList;

import java.util.Scanner;



public class LinkedList_Demo {
   static Node head;
    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next= null;
        }

    }

    public Node insertHead( int val){
        Node node= new Node(val);
        node.next= head;
        head = node;
        return head;
    }
    public void print( Node head){
        Node curNode= head;
        while (curNode!=null){
            System.out.println(curNode.val+" ");
            curNode = curNode.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LinkedList ls = new LinkedList();
//
//        int n = sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0; i<n;i++){
//            int p = sc.nextInt();
//
//        }
        LinkedList_Demo list = new LinkedList_Demo();
        list.insertHead(2);
        list.insertHead( 3);
        list.print(list.head);


    }
}
