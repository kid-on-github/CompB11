/*
* This program prints "Hello World".
*
* @author Mike Peterson
* Course: COMP B11
* Created: Jan 22, 2019
* Source File: SphereVolume.java
*/

public class SphereVolume {
    public static void main(String[] args) {
        double radius;
        double volume;

        radius = 10;
        volume = (4.0/3) * Math.PI *  (radius*radius*radius);

        System.out.println(volume);
    }
}