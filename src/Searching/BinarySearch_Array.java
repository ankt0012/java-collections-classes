package Searching;

import java.util.Scanner;

public class BinarySearch_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in array: ");
        printArray(arr);
        System.out.println("Enter the value you want to find in array: ");
        int key = sc.nextInt();
        int last = arr.length-1;
        binarySearch(arr, 0, last, key);

    }

    public static void printArray(int[] array) {
        int n = array.length;
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = sc1.nextInt();
        }

    }
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
}