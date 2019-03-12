/* 
* This program prints the sum of all negative numbers entered and
* the sum of all positive numbers entered.
*
* @author Harinder Singh and Michael Peterson
* Course: COMP B11
* Created: Mar 5, 2019
* Source File: CountNumbers.java
*/
import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double sumPositive = 0; 
		double sumNegative = 0;
		System.out.println("Enter Numbers (Q to quit):");
		double userInput;
		while(in.hasNextDouble()){
			userInput = in.nextDouble();
			if(userInput > 0){
				sumPositive += userInput;
			}
			else{
				sumNegative += userInput;
			}
		}
		System.out.printf("Total of positive numbers is %.4f\n",sumPositive);
		System.out.printf("Total of negative numbers is %.4f\n",sumNegative);

	}

}
