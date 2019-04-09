/**
* Author: Michael Peterson
* Course: CompB11
* Date: 4/9/2019
* Name: RectangleStars.java
* Description: Print a rectangle of user specified dimensions
*/

import java.util.Scanner;

public class RectangleStars {
    /**
     * Print a rectangle of asterisks, width wide and height tall
     * @param width width of rectangle
     * @param height height of rectangle
     */
    public static void printRectangle(int width, int height){
        for (int h=0; h<height; h++){
            for (int w=0; w<width; w++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        int width, height;

        System.out.println("Enter two integers");
        width = in.nextInt();
        height = in.nextInt();
        printRectangle(width, height);

    }
}