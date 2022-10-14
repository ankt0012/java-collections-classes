import java.util.ArrayList;

public class ArryList {
    public static void main(String[] args) {
        ArrayList<Integer> myArray= new ArrayList<Integer>();
        for (int i =0; i<10; i++){
            myArray.add(i+1);
        }

        for(int i : myArray){
            System.out.println(i);
        }
    }
}
