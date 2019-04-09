/* 
* This program creates an array of random numbers with size 
* entered by the user and sorts them from smallest to 
* largest 
*
* @author  Erik Moreno, Michael Peterson
* Course: COMP B11
* Created: Mar 19, 2019
* Source File: FillAndSortArray.java
*/

import java.util.*; 


public class FillAndSortArray {
    public static void main(String[] args) {
        
        Random random = new Random(1234);
        Scanner in = new Scanner(System.in);
				
        System.out.print("How many elements in array? ");
		int arraySize = in.nextInt(); 
		double[] randomNumbers = new double[arraySize];
		
		for(int i = 0; i < randomNumbers.length; i++) { 
			randomNumbers[i] = random.nextDouble() * 100;
		}
        
		Arrays.sort(randomNumbers);
		
		for(int i = 0; i < randomNumbers.length; i++) { 
		System.out.println(randomNumbers[i]);
		}
		
	}
}
		
		
	