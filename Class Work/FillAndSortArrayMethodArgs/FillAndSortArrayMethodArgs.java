/*
* This Program takes user input via command line arguments and generates a 
* sorted array populated with random numbers.
* @author Sean Dang, Mike Peterson
* Course: COMP B11
* Created: March 21, 2019
* Source File: FillAndSortArrayMethodArgs.java
*/
import java.util.*;

public class FillAndSortArrayMethodArgs{
	/**
	* Fill array with numbers from low to high.
	* @param array empty array to be populated
	* @param low the lowest value that can be randomly assigned
	* @param high the highest value that can be randomly assigned
	*/
	public static void fillArrayRandom(double[] array,double low,double high){
		Random random = new Random(1234);
		for(int i = 0; i < array.length; i++){
			double randomNum = random.nextDouble() * (high - low) + low;
			array[i] = randomNum;
		}
	}
	/**
	* Prints the array
	* @array arrray filled with random numbers
	*/
	public static void printArray(double[] array){
		for(double i : array){
			System.out.println(i);
		}
	}
	public static void main(String[] args){	
		int totalRandomNum = Integer.parseInt(args[0]);
		double lowRange = Double.parseDouble(args[1]);
		double highRange = Double.parseDouble(args[2]);
		
		double[] randomNumbers = new double[totalRandomNum];
		
		fillArrayRandom(randomNumbers, lowRange, highRange);
		Arrays.sort(randomNumbers);
		printArray(randomNumbers);
	}
}