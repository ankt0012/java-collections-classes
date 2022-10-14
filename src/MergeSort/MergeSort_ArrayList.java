package MergeSort;

import java.util.ArrayList;
import java.util.Scanner;


public class MergeSort_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr.add(i, sc.nextInt());
        }
        sort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr.get(i));
        }
    }
    static void sort(ArrayList<Integer> arr, int l, int r){
        if(l<r){
            int  mid = (l+r)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge1(arr, l, mid, r);

        }

    }

    private static void merge1(ArrayList<Integer> arr, int l, int mid, int r) {
        int n1= mid-l+1;
        int n2= r-mid;
        ArrayList<Integer> L= new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();

        for(int i=0; i<n1; i++){
            L.add(arr.get(l+i));
        }
        for(int j=0; j<n2; j++){
            R.add(arr.get(mid+1+j));
        }
        int i=0, j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L.get(i)<=R.get(j)){
                arr.add(k, L.get(i));
                i++;
            }else{
                arr.add(k, R.get(j));
                j++;
            }
            k++;
        }
        while(i<n1){
            arr.add(k, L.get(i));
            i++;
            k++;
        }
        while(j<n2){
            arr.add(k, R.get(j));
            j++;
            k++;
        }

    }
}
