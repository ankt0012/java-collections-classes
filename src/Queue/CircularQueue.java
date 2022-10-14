package Queue;

public class CircularQueue {
    static class Queuee{
        static int size;
        static int[] arr;
        static int rear=-1;
        static int front =-1;
        Queuee(int n){
            arr= new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void enqueue(int data){
            if(isFull()){
                System.out.println(" full queue");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear= (rear+1)%size;

            arr[rear]= data;
        }
        public static int deQueue(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            return arr[front];

        }
    }
    public static void main(String[] args) {
        QueueDemo.Queuee q = new QueueDemo.Queuee(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enqueue(6);
        q.enqueue(7);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.deQueue();
        }
    }
}
