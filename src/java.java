import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main (String[] args) {
        // Your code here
        Scanner sc;
        sc = new Scanner(System.in);

        ArrayList<Character> A= new ArrayList<>(5);
        for(int i=0; i<5; i++){
            char ch = sc.next().charAt(0);
            A.add(i, ch);
        }
        int count=0;
        int n= A.size();
        for(int i=0; i<A.size() ; i++){
            for(int j=i+1; j<n; j++){
                int key;
                if(A.get(i)==A.get(j)){
                    A.remove(i);
                    System.out.println(A.size());
                    n= A.size()-1;
                }
            }
        }
        for(int i=0; i<A.size();i++){
            System.out.print(A.get(i)+ " ");
        }
    }
}