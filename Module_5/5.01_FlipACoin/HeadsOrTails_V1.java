/**
 * Write a description of class HeadsOrTailsV1 here.
 * 
 * *********************************************************************************
 * (+s) I am learning to work with Math and random
 * 
 * *********************************************************************************
 * @author (Adrian Marimon) 
 * @version (11/30/2016)
 */

import java.util.Scanner;
public class HeadsOrTails_V1
{
    public static void main(String [] args)
    {
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double rNum = 0.0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many times you want to flip the coin?");
        int flips = in.nextInt();
        
        
        while(counter <= flips)
        {
            rNum = Math.random();
            System.out.print (counter + "\t" + rNum);
            
            if(rNum < 0.5)
            {
                heads++;
                System.out.println("\t heads");
            }
            
            else
            {
                tails++;
                System.out.println("\t tails");
            }
            counter++;
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);
    }
}
