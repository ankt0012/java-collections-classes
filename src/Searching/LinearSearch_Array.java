package Searching;

import java.util.Scanner;

public class LinearSearch_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the Elements in array: ");
        printArray(arr);
        System.out.println("Find the key in array: ");
        int key= sc.nextInt();
        System.out.println("Element found at index : ");
        System.out.println(linearSearch(arr, key));
    }
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void printArray(int[] array){
        int n= array.length;
        Scanner sc1 = new Scanner(System.in);
        for(int i=0; i<n; i++){
            array[i]=sc1.nextInt();

        }
    }
}
