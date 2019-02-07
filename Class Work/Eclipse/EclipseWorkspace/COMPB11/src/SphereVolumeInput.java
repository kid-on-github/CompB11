/*
* This program prints "The volume of a sphere".
*
* @author Angel Villaneda
* @author Jane Thompson
* @author Mike Peterson
* Course: COMP B11
* Created: Jan 24 2019
* Source File: SphereVolumeInput.java
*/

import java.util.Scanner;

public class SphereVolumeInput{
    public static void main(String[] args) {
        double radius;
        double volume;

        radius = 10;
        

        // prompt user
        System.out.print("Please enter your radius: ");

        // new instance of Scanner named "in"
        Scanner in = new Scanner(System.in);

        // read input
        radius = in.nextInt();

        // determine the volume
        volume = (4.0/3) * Math.PI *  (radius*radius*radius);
        
        // output new radius
        System.out.println("Here is your volume: " + volume + "\n");
    }
}