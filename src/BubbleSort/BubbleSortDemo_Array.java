package BubbleSort;

import java.util.Scanner;

public class BubbleSortDemo_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i= 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        bubbleSortting(arr);
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSortting(int[] array){
        int n= array.length;
        int temp=0;
        for (int i=0; i<n; i++){
            for( int j=1; j<n-i; j++){
                if ( array[j-1]>array[j]){
                    temp= array[j-1];
                    array[j-1]=array[j];
                    array[j]= temp;
                }
            }
        }

    }
}
// 3 2 1
