/**
 * Write a description of class DiceProbability here.
 * 
 * ***********************************************************************************************************************************************************************************************
 * (+s)is good work with for loop, i just understand the difference between for and while loop.
 * 
 * ***********************************************************************************************************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/05/2016)
 */

import java.util.Scanner;
import java.util.Random;

public class DiceProbability
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        Random ran;
        ran = new Random();
        
        int d1;
        int d2;
        int sides = 6;
        int dR;
        int sum;
        int sumOfD;
        double numOfR;
        double match = 0;
        
        
        System.out.print("Enter how many times do you want the deci be rolled: ");
        dR = in.nextInt();
        
        System.out.println("Sum of Dice \tProbability");
            for(sum = 2; sum <= 2 * sides; sum++)
            {
                for(numOfR = 0; numOfR <= dR; numOfR++)
                {
                    d1 = ran.nextInt(sides) + 1;
                    d2 = ran.nextInt(sides) + 1;
                    
                    sumOfD = d1 + d2;
                    
                    if(sumOfD == sum)
                    {
                        match += 1;
                    }
                }
                
                double probability = (match / numOfR) * 100;
                System.out.println(sum + "s:" + "\t\t" + probability);
                match = 0;
            }
    }
}
