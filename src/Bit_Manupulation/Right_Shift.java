package Bit_Manupulation;

public class Right_Shift {
    public static void main(String[] args) {
        int result = 23>>2;
        System.out.println(result);
    }
}
/*
23              -> 1 0 1 1 1
1rightshift     ->   1 0 1 1    = 11
2rightshift     ->     1 0 1    = 5
                   64+ 16+8+4=92
 */