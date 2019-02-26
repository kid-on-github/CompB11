/*
* Author: Michael Peterson
* Course: CompB11
* Date: 2/12/2019
* Name: ProgramExam2practice
* Description: Calculate hypotenuse using the Pythagorean Theorem.
*/

/*
* Use meaningful names and normal Java conventions for your variables.
* Name your class as specified.
* Format your code before submission.
* Submit the .javafile, notthe .classfile.
* Include the usual comments for the class: 
*   - Author
*   - Course name
*   - Date and time
*   - Source file name
*   - Brief description
*/

import java.util.Scanner;
import java.lang.Math;


public class ProgramExam2practice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        
        System.out.println("Enter the length of the two shorter sides of a right triangle");
	    double length1, length2, hypotenuse;
        length1 = in.nextDouble();        
        length2 = in.nextDouble();

        double length1Squared = length1 * length1;
        double length2Squared = length2 * length2;

        hypotenuse = Math.sqrt(length1Squared + length2Squared);

        System.out.println("If the two short sides of a right triangle have");
        System.out.printf("lengths %f and %f, the hypotenuse is %f.", length1, length2, hypotenuse);
        
        
    }
}