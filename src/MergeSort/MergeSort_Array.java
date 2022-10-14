package MergeSort;

import java.util.Scanner;

public class MergeSort_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array: ");
        implementationOfArray(arr);
        sort(arr,0, n-1);
        printArray(arr);
    }


    public static void implementationOfArray(int[] array) {
        int n = array.length;
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = sc1.nextInt();
        }


    }

    public static void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void sort(int[] array, int l,int r){
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }
    static void merge(int[] array, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[m + 1 + j];


        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;

        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }

}