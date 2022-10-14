package TwoPointerAlgorithum;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoPointerDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<Integer, Integer>> resultPair = new ArrayList<>();
        int[] arr= {5, 9, -5, 6, -9};
        for(int i=0 ; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i]+arr[j]==0){
                    resultPair.add(new HashMap<>(arr[i], arr[j]));

                }
            }
        }
        for(HashMap<Integer, Integer> result: resultPair){
            System.out.println(result);
        }
    }
}
