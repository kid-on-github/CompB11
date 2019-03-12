/* 
* This program prints pairs of characters in the input line 
* where the first character is less than the second.
*
* @author Harinder Singh and Michael Peterson
* Course: COMP B11
* Created: Mar 7, 2019
* Source File: CountRisingPairs.java
*/
import java.util.Scanner;

public class CountRisingPairs {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int timesLessThan = 0;

        System.out.println("Enter a line: ");
        String userInput = in.nextLine();

        for(int i=1; i < userInput.length(); i++){
            char current, previous;
            current = userInput.charAt(i);
            previous = userInput.charAt(i-1);

            if(previous < current){
                timesLessThan++;
            }
        }

        System.out.println(timesLessThan);
	}
}
