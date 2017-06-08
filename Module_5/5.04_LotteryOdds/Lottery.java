
/**
 * Write a description of class Lottery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner; 
public class Lottery
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        String rLotteryNum = "";
        String Guess = "";
        
        for(int i = 0; i < 3; i++)
        {
            int rNum = (int)(Math.random() * 10);
            rLotteryNum += Integer.toString(rNum);
        }
        
        System.out.print("Please enter three numbers (e.g. 123): ");
        Guess = in.nextLine();
        
        System.out.println("    Winning Lottery Number: " + rLotteryNum);
        
        
        
        if(Guess.equals(rLotteryNum))
        {
            System.out.print("    Congratulations, both pairs matched.");
        }
        else if(Guess.substring(0, 2).equals(rLotteryNum.substring(0, 2)))
        {
            System.out.print("    Congratulation, the front pairs matched.");
        }
        else if(Guess.substring(1, 3).equals(rLotteryNum.substring(1, 3)))
        {
            System.out.print("    Congratulations, the end pair matched.");
        }
        else
        {
            System.out.print("    Sorry, no matches.");
        }
    }
}
