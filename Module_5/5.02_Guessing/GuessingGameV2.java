
/**
 * Write a description of class GuessingGameV2 here.
 * ******************************************************************************************************
 * (-s) was hard to enderstand how do the computer to select a number random between the values that we 
 * we select but i found help and finally i solved.
 * 
 * (+s)i am gettin experience with new forms to use random
 * ******************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/03/16)
 */

import java.util.Scanner;
public class GuessingGameV2
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int counter = 0;
        
        System.out.print("Enter the lowest number that you want: ");
        int lNum = in.nextInt();
        
        System.out.println();
        
        System.out.print("Now enter the highest: ");
        int hNum = in.nextInt();
        int rNum = (int)(Math.random() *  (hNum - lNum) + lNum);
        
        
        boolean Guess = true;
        
        System.out.println();
        
        System.out.println("Was selected a random number between " + lNum + "-" + hNum + " by the computer, try to guess! ");
        
        System.out.println();
        
        
        while(Guess) 
        {
			System.out.print("Try to guess the number: ");
			int guess = in.nextInt();
				
			counter++;
			
			System.out.println();
			
			if(rNum == guess)
			{
				System.out.println("Congratulations!");
				Guess = false;
				
				System.out.println();
			}
			
			else if(rNum < guess)
			{
				System.out.println("Too High");	
				System.out.println();
			}
			else
			{
				System.out.println("Too Low");
				System.out.println();
			}
		}
		
		System.out.println("The randomly number was: " + rNum);
		System.out.println("You take " + counter + " guesses before guess number.");
    }
}
