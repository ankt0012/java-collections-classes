package Bit_Manupulation;

public class Left_Shift {
    public static void main(String[] args) {
        int result = 23<<2;
        System.out.println(result);
    }
}

/*
23              -> 1 0 1 1 1
1leftshift      -> 1 0 1 1 1 0  = 46
2leftshift      -> 1 0 1 1 1 0 0 = 92
                   64+ 16+8+4=92
 */
