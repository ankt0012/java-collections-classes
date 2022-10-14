package BubbleSort;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arry = {0,1,0,1,0,0,1,1,1,0};
        int n= arry.length;
        int count = method(arry);

        for(int i=0; i<count; i++){
            System.out.print((arry[i]=0)+ ", ");
        }
        for(int i=count; i<n; i++){
            System.out.print((arry[i]=1 )+ ", ");
        }
    }
    public static int method(int array[]){
        int n= array.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(array[i]==0){
                count++;
            }
        }
        return count;
    }
}
