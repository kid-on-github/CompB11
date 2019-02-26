/*
* This program adds up numbers 1 -> n.
*
* @author Hailey Lelouis, Mike Peterson
* Course: COMP B11
* Created: Feb 26, 2019
* Source File: Summation.java
*/

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = in.nextInt();
        int currentNum = 0;
        int i = 1;

        while (i <= n){
            currentNum += i;
            i++;
        }

        System.out.printf(
            "The sum of all i, where i runs from 1 to %d equals %d.\n",
            n, currentNum);
    }
}