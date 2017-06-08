
/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class KeyboardInput_v2
{
    public static void main(String [ ] args)
    {
        //construct a Scanner object with one line
        Scanner in = new Scanner(System.in);       
	    
        //use the nextInt() method to enter an integer value
        System.out.print("Please enter an integer value:  ");
        int intValue = in.nextInt();
        System.out.println("You entered: " + intValue);
        System.out.println();
        
        //use the nextDouble method to enter a decimal value
        System.out.print("Please enter a decimal value:  ");
        double decimalValue = in.nextDouble();
        System.out.println("You entered: " + decimalValue);
        System.out.println();
    }
}
