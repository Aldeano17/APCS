
/**
 * Write a description of class Family here.
 * 
 * ****************************************************************************************************
 * (+s) i see new import methods 
 * 
 * (-s)was hard to understand how work with the new import methods.
 * ****************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/04/16)
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Family
{
 public static void main(String [] args) throws IOException
    {
        int twoBoys = 0;
        int twoGirls = 0;
        int BG = 0;
        int counter = 0;
        double p2Boys = 0;
        double pBG = 0;
        double p2Girls = 0;
        
        String token = "";
        
        Scanner inFile = new Scanner(new File ("MaleFemaleInFamily.txt"));
        
        while(inFile.hasNext())
        {
            token = inFile.next();
            System.out.println(token);
            
            if(token.equals("BB"))
            {
                twoBoys++;
                counter++;
            }
            else if(token.equals("GG"))
            {
                twoGirls++;
                counter++;
            }
            else
            {
              BG++;
              counter++;
            }
        }
        
        System.out.println("Sample Size " + counter);
        System.out.println("Number of families with 2 boys: " + twoBoys);
        System.out.println("Number of families with 2 Girls: " + twoGirls);
        System.out.println("Number of families with 1 Girl and 1 Boy: " + BG);
        
        
        inFile.close();
        p2Boys = (double)twoBoys / (double)counter;
        p2Girls = (double)twoGirls / (double)counter;
        pBG = (double)BG / (double)counter;
        
        System.out.println("Probability of 2 Boys: " + p2Boys);
        System.out.println("Probability of 2 Girls: " + p2Girls);
        System.out.println("Probability of 1 boy and 1 girl: " + pBG);
    }
}
