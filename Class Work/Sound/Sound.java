/*
* This class contains the method deMangleList
* @author Matthew Morales, Michael Peterson
* Course: COMP B11
* Created: March 28, 2019
* Source File: Sound.java
*/
import java.util.*;


public class Sound{
	/**
	* This method swaps the elements at i and 2*i%ArraySize
	* @param inputList The initial inputted array
	*/
	public static void deMangleList(ArrayList<Double> inputList){
		int listSize = inputList.size();
		for(int i = 0; i < listSize; i++){
			double tmp = inputList.get(i);
			inputList.set(i, inputList.get(2*i%listSize));
			inputList.set(2*i%listSize, tmp);
		}
	}
}