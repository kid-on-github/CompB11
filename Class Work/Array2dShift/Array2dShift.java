/*
* This program takes in a 2d array and shifts it's contents from position 0  
* to the last position in the array. It also shifts other 
* contents accordingly.
* @author Sean Dang, Mike Peterson
* Course: COMP B11
* Created: March 26, 2019
* Source File: Array2dShift.java
*/
import java.util.*;

public class Array2dShift{
	/**
	* Shift 2D array
	* @param array 2D array to be shifted
	*/
	public static void shiftArray(int[][] array){
		for(int row=0; row < array.length; row++){
			int firstVal = array[row][0];
			int rowLength = array[row].length;

			for(int col=0; col < rowLength-1; col++){
				array[row][col] = array[row][col+1];
			}
			
			array[row][rowLength-1] = firstVal;
		}
	}
}