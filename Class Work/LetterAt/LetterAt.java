
/* 
* This program will display the desired index of word entered 
*
* @author Michael Peterson and Alejandra Zapata
* Course: COMP B11
* Created: Feb 5, 2019
* Source File: IfAndString.java
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