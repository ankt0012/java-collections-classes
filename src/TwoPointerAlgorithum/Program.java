package TwoPointerAlgorithum;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr= {-8,-5,-6,8,6,9,5};
        int n= arr.length;

        Arrays.sort(arr);

        for(int k=0; k<n-2; k++) {
            int i =k+1;
            int j= n-1;
            while (i < j) {
                if (arr[k] + arr[i] + arr[j]==n){
                    System.out.println("["+arr[k]+", "+arr[i]+", "+arr[j]+"]");
                    i++;
                    j--;

                }else if(arr[k]+arr[i]+arr[j]<n){
                        i++;

                }else{
                    j--;
                }
            }
        }
//        for(int h : array){
//            System.out.println(h);
//        }
    }
}
