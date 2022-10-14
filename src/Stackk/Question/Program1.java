package Stackk.Question;

import java.util.*;

/*We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents its
direction (positive meaning right, negative meaning left). Each asteroid moves at the same
speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one
will explode. If both are the same size, both will explode. Two asteroids moving in the same
direction will never meet.
    intput = (5 10 -5)
    output =  (5 10 )
*/

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        stackkk(arr);
    }
    static  void stackkk(int[] arr){
        Stack<Integer> stk = new Stack<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i]>0){
                stk.push(i);
            }else{
                while (stk.size()>0 && arr[stk.peek()]>0 && arr[stk.peek()]<Math.abs(arr[i])){
                    stk.pop();
                }
                if(stk.size()==0 || arr[stk.peek()]<0){
                    stk.push(i);
                }else if(arr[stk.peek()]==Math.abs(arr[i])){
                    stk.pop();
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while (stk.size()>0){
            list.add(arr[stk.pop()]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
