package Stackk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackDemo {
    static  class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;        }
    }
    static  class stack{
        public static Node head;
        public static boolean isEmpty(){
            return  head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if( isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return (-1);
            }
            int top = head.data;
            head=head.next;
            return top;
        }
        public static  int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public static void print(Node head){

            if(head==null){
                return;
            }
            Node newNode=head;
            while(newNode !=null){
                System.out.print(newNode.data+ " ");
                newNode= newNode.next;

            }
        }
        public static void pushAtBottom(int data){
            if(head==null){
                push(data);
                return;
            }
            int top = pop();
            pushAtBottom(data);
            push(top);

        }
        public static void reverse(){
            if(head==null){
                return;
            }
            int top= pop();
            reverse();
            pushAtBottom(top);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack stk = new stack();
        List<Integer> lt = new ArrayList<>();

        int n= sc.nextInt();
        for(int i=0; i<n; i++){
           stk.push(sc.nextInt());
        }
        stk.pushAtBottom(4);
        stk.reverse();
//        for (int i=0; i<n; i++) {
//            lt.add(stk.pop());
//        }
//        Collections.reverse(lt);
//        for(int x : lt){
//            System.out.print(x+ " ");
//        }
       stk.print(stack.head);
    }
}
