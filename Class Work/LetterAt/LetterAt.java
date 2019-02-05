
/* 
* This program asks for word and states if the word begins with the letter a. 
*
* @author Michael Peterson and Alejandra Zapata
* Course: COMP B11
* Created: Feb 5, 2019
* Source File: IfAndString.java

 prompt the user to enter a word
 read the word
 prompt the user to enter an index into the word
 read the index (You can assume the user enters a non-negative integer)
 
 if the index is legal, print out the letter at the given index, in the format
 shown in the examples below, using printf properly. 
 
 if the index is NOT legal, print out an error message in the format shown in
 the examples below.
*/

import java.util.Scanner;

public class LetterAt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String wordEntered = in.next();

		System.out.println("Enter index: ");
		int indexEntered = in.nextInt();

		int wordLength = wordEntered.length();

		if (indexEntered < wordLength){
			char letterAtIndex = wordEntered.charAt(indexEntered);
			System.out.printf("In word \"%s\", the letter at index %d is '%c'.\n", wordEntered, indexEntered, letterAtIndex);
		}
		else {
			System.out.printf("%d is not a legal index for \"%s\".\n", indexEntered, wordEntered);
		}
	}
}