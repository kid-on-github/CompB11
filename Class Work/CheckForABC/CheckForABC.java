/* 
* This program was made for the exam on if statements
*
* @author Michael Peterson
* Course: COMP B11
* Created: Mar 12, 2019
* Source File: CheckForABC.java
*/


import java.util.Scanner;
public class CheckForABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line and an index, in that order");
        
        String line = in.nextLine();
        int index = in.nextInt();

        // if index is valid
        if (index < line.length()){
            char letter = line.charAt(index);
            
            if (letter=='A' || letter=='B' || letter=='C'){
                System.out.printf("Found '%c' at index %d.\n",letter,index);
            }
            
            else{
                System.out.printf(
                    "The character at index %d is neither A, nor B, nor C.\n"
                    ,index);                
            }
        }
        else {
            System.out.printf("Illegal index: %d.\n",index);
        }

	}

}
