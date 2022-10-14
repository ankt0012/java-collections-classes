package LinkedList.Questions;

public class Problem2 {
     static Node head;
    static int size=0;
    static class Node{
       static int data;
        static Node next;
        Node(int data){
            this.data= data;
            next=null;
            size++;
        }

    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr= head;
        while (curr.next !=null){
            curr= curr.next;
        }
        curr.next= newNode;
    }
    public static int getSize(){
        return size;
    }
    public Node reverse(){
        if(head==null ){
            return head;
        }
        if(head.next==null){
            return head;
        }
        Node prv = head;
        Node curr = head.next;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prv;
            prv= curr;
            curr=nextNode;
        }
        head.next=null;
        head=prv;
        return head;
    }

    public static void print(){
        if(head==null){
            return;
        }
        Node curr = head;
        while (curr.next != null){
            System.out.println(curr.data +" ");
            curr= curr.next;
        }
    }

    public static void main(String[] args) {
        Problem2 list1 = new Problem2();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
       list1.print();
        list1.reverse();

    }

}
