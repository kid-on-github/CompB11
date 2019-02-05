
/* 
* This program asks for word and states if the word begins with the letter a. 
*
* @author Alejandra Zapata and Michael Peterson
* Course: COMP B11
* Created: Jan 31, 2019
* Source File: IfAndString.java
*/

import java.util.Scanner;

public class IfAndString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter word: ");
		String inWord = in.next();
		if (inWord.substring(0,1).equals("a")) {
			System.out.printf("\"%s\" starts with 'a'.\n",inWord);
		}
		else {  
			System.out.printf("\"%s\" does not start with 'a'.\n",inWord);
		}
	}
}