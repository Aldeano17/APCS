
/**
 * Write a description of class j here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class KeyboardInput_v1
{
    public static void main(String [ ] args)
    {
        //construct a Scanner object with two lines
        Scanner in;
        in = new Scanner(System.in);
	    
        //use the nextInt() method to enter an integer value
        System.out.print("Please enter an integer value:  ");
        int intValue = in.nextInt();
        System.out.println("You entered: " + intValue);
        System.out.println();
    }
}
