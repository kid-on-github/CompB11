/*
* This program adds up numbers 1 -> n.
*
* @author Hailey Lelouis, Mike Peterson
* Course: COMP B11
* Created: Feb 28, 2019
* Source File: SummationFor.java
*/

import java.util.Scanner;

public class SummationFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();
        int currentNum = 0;

        for(int i=1; i <= n; i++){
        	currentNum+=i;
        	
        }

        System.out.printf(
            "The sum of all i, where i runs from 1 to %d equals %d.\n",
            n, currentNum);
    }
}