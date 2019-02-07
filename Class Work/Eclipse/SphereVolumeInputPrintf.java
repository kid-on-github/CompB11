/*
* This program prints "The volume of a sphere".
*
* @author Mike Peterson
* Course: COMP B11
* Created: Jan 29 2019
* Source File: SphereVolumeInputPrintf.java
*/

import java.util.Scanner;

public class SphereVolumeInputPrintf{
    public static void main(String[] args) {
        double radius;
        double volume;

        // prompt user
        System.out.print("Enter radius: ");

        // new instance of Scanner named "in"
        Scanner in = new Scanner(System.in);

        // read input
        radius = in.nextDouble();

        // determine the volume
        volume = (4.0/3) * Math.PI *  (radius*radius*radius);
        
        // output new radius
		System.out.printf("The volume of a sphere\nwith radius %.4f is %.4f.\n", radius, volume);
	}
}