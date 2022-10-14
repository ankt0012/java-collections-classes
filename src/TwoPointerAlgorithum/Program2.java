package TwoPointerAlgorithum;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        int[] arr = {1,8,7,4,5,6,1,2,3};
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(arr[i]+" ");
        }
    }

}
