import java.util.Scanner;

public class InsertionSort_Array {
    public static void main(String[] args) {
        try  {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr= new int[n];
            for (int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            insertionSort(arr);
            System.out.print(arr);
            System.out.println();
            for( int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void insertionSort(int[] array){
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
//3 2 1
