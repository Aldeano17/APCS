/**
 * Prompts user to select a category and tests the menu structure.
 * *****************************************************************************************************
 * (+s)On this class i learncsome new String methods that i can use in the future.
 * 
 * (-s)Some times is confuse work with new method. But i finally got it.
 * *****************************************************************************************************
 *@author(Adrian Marimon) 
 * @version(11/26/2016)
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Heathy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training");
        
        System.out.println("Please enter the letter only that corresponds to your choice: ");
        String choice = in.next();
        
        
        System.out.println();
        
        
        
        if(choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equalsIgnoreCase("B") ) //condition for choice B goes in the parentheses
        {
            System.out.println("Testing: You chose B for BMR");
        }
        else if (choice.equalsIgnoreCase("C") ) //condition for choice C goes in the parentheses
        {
             System.out.println("You chose C for Healthy Eating");
        }
        else if (choice.equalsIgnoreCase("D") ) //condition for choice D goes in the parentheses
        {
            System.out.println("You chose D for Food Pyramid");
        }
        else if (choice.equalsIgnoreCase("E") ) //condition for choice E goes in the parentheses
        {
            System.out.println("You chose E for Fitness Training");
        }
        else //default choice for an invalid entry
        {
            System.out.println("The choice you entered was invlaid, please try again.");
        }
    }
}