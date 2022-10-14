package LinkedList;

public class LL {
   static Node head;
    private int size;
    LL(){
        this.head=null;
        this.size= 0;
    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;

        }
    }

    public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
    }

    public void addLast(int data) {
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

    public void deleteFirst(){
        if(head== null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head= head.next;
    }

    public void deleteLast(){
        if(head== null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next= null;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
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
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.print();
        list.add(3);
        list.print();
        list.add(4);

        list.print();
        System.out.println(list.getSize());

//        list.addFirst(0);
//        list.print();
//        System.out.println(list.getSize());
        reverseIterate();
        list.print();
    }




}
