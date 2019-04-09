/**
* Author: Michael Peterson
* Course: CompB11
* Date: 4/7/2019
* Name: ProgramExamLoopsMethodsPracticeS2015
* Description: Estimate Pi
*/

import java.util.Scanner;
import java.lang.Math;


public class ProgramExamLoopsMethodsPracticeS2015 {
    /**
     * Return an estimation of pi
     * @param numberOfTerms how many terms should go into the estimation
     * @return estimation of pi
     */
    public static double pi(int numberOfTerms){
        double estimate = 0;        
        
        for (int i=1; i<=numberOfTerms; i++){
            double currentNumber = 1.0/(i*2.0-1.0);
            //System.out.println(currentNumber);
            estimate += i%2==0 ? -currentNumber : currentNumber;
        }
        
        return estimate*=4;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        
        System.out.println("Enter the number of terms to use to estimate PI");
        int numberOfTerms = in.nextInt();
        
        System.out.printf("With %d terms:\n",numberOfTerms);
        System.out.printf("the estimate of PI is %.12f\n", pi(numberOfTerms));
        System.out.printf("For comparison, Math.PI is %.12f\n", Math.PI);
    }
}