/*
* Author: Michael Peterson
* Course: CompB11
* Date: 2/12/2019
* Name: ProgramExam2
* Description: Exam practice working with printf and user input
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

public class ProgramExam2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        
        System.out.println("Enter two words");
		String word1, word2;
        word1 = in.next();        
        word2 = in.next();        

        System.out.printf("%s is the second word and %s the first word.\n", word2, word1);
        System.out.printf("%s%s is the concatenation of the two words.\n", word1, word2);
        
        
    }
}