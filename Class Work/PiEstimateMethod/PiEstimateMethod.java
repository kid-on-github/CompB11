/* 
* This program estimates Pi
*
* @author Michael Peterson, Erik Moreno
* Course: COMP B11
* Created: Mar 14, 2019
* Source File: PiEstimateMethod.java
*/


import java.util.Scanner;
import java.util.Random;

public class PiEstimateMethod {
    /**
    * This method computes an estimate of PI by generating random (x,y)'s in the
    * positive quadrant of the unit circle and then taking the ratio of the
    * number of times (x,y) is within the unit circle to the total number of
    * (x,y)'s generated. Multiplying that ratio by 4 gives the estimate of PI.
    *
    * @param numTries the number of tries to use in estimate
    * @param random the Random object with which to generate random doubles
    * @return An estimate of PI using numTries
    */

    public static double estimatePi(int numTries, Random random){
            int hits = 0;
            for (int i = 1; i <= numTries; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            // Check whether the point lies in the unit circle
                if (x * x + y * y <= 1) {
                    hits++;
                }
            }
            return 4.0 * hits / numTries;
        }


    



    public static void main(String[] args) {
        
        Random random = new Random(1234);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of tries (Q to quit):");
        
        while(in.hasNextInt()){
            int numTries = in.nextInt();
            double piEstimate = estimatePi(numTries, random);
            System.out.printf("With %,d tries, your estimate of PI is %f\n", numTries, piEstimate);
        }
        System.out.println("BYE");        
    }
}
