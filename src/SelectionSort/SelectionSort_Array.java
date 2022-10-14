import java.util.Scanner;

public class SelectionSort_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];

        for( int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        selectionSort(arr);
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionSort(int[] array){
        for (int i=0;i< array.length-1; i++){
            int index =i;
            for (int j=i+1; j<array.length; j++){
                if(array[j]<array[index]){
                    index=j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
}
// 3 2 1
