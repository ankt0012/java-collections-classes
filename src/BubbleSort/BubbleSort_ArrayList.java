package BubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort_ArrayList {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            ArrayList<Integer> arr = new ArrayList<>();
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                arr.add(i, s.nextInt());
            }


            System.out.println(arr.size());
            System.out.println("The elements before sortting : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println("\nThe elements after sortting : ");
            bubbleSort(arr);
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i)+ " ");
            }
        }
    }

    public static void bubbleSort(ArrayList<Integer> array) {
        int n = array.size();
        Integer temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array.get(j - 1) > array.get(j)) {
                    temp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, temp);


                }
            }
        }
    }
}
