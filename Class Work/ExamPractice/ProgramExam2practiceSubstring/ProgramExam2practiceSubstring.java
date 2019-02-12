/*
* Author: Michael Peterson
* Course: CompB11
* Date: 2/12/2019
* Name: ProgramExam2practiceSubstring
* Description: substring practice
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


public class ProgramExam2practiceSubstring {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        String userString, stringSection;
        int index1, index2;

        System.out.println("Enter a line:");
        userString = in.nextLine();

        System.out.println("Enter first and last index of desired substring");
        index1 = in.nextInt(); 
        index2 = in.nextInt();
        stringSection = userString.substring(index1, index2+1);
    
        System.out.printf("The characters from %d to %d are \"%s\"\n", index1, index2, stringSection);
        
        
    }
}