/*
* @author: Michael Peterson
* Course: CompB11
* Created: 2/14/2019
* Source File: QuotientSum
* Description: 
*   - Read 3 numbers
*   - Devide the sum of the first two numbers by the third number
*   - Print out the three numbers along with the quotient
*/



import java.util.Scanner;

public class QuotientSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        
        System.out.println("Enter three numbers.");
		double number1, number2, number3, quotient;     

        number1 = in.nextDouble();
        number2 = in.nextDouble();
        number3 = in.nextDouble();
        
        quotient = (number1+number2)/number3;
        
        System.out.printf("(%.3f + %.3f)/%.3f = %.3f\n",number1,number2,number3,quotient);
    }
}