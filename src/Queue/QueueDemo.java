package Queue;

public class QueueDemo {
    static class Queuee{
        static int size;
        static int[] arr;
        static int rear=-1;
        Queuee(int n){
            arr= new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void enqueue(int data){
            if(rear== size-1){
                System.out.println(" full queue");
                return;
            }
            rear++;
            arr[rear]= data;
        }
        public static int deQueue(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println(" queue is empty");
                return -1;
            }
            return arr[0];

        }
    }
    public static void main(String[] args) {
        Queuee q = new Queuee(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.deQueue();
        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.deQueue();
        }



    }
}
