/*
* This table prints powers of x.
* @author Mike Peterson
* Course: COMP B11
* Created: Mar 5, 2019
* Source File: PowerTable.java
*/

public class PowerTable {
    public static void main(String[] args){
        for(int base = 1; base <= 10; base++){
            for(int power = 1; power <= 4; power++){
                System.out.printf(" %8.0f", Math.pow(base,power));
            }
            System.out.println();
        }
    }
}