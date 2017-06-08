
/**
 * Write a description of class BottleCapsPrize here.
 * *********************************************************************************************
 * (-s)at the beginning was i don't understand how use some clases that i had to import.
 * 
 * (+s)now i understand how they work.
 * *********************************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/29/16)
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.File;

public class BottleCapsPrize
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        Random rNum = new Random();
        
        PrintWriter outFile = new PrintWriter(new File("trials.txt"));
        
        int bNum = 0;
        int openedBottles = 0;

        System.out.print("How many trials would you like: ");
        int trails = in.nextInt();
        
        
        for(int i = 1; i <= trails; i++)
        {
            bNum = rNum.nextInt(5);
            while(bNum != 2)
            {
                bNum = rNum.nextInt(5);
                openedBottles++;
            }
        }
        
        System.out.println("Bottles opened: " + openedBottles);
        
        //average of bottles you need open to win
        
        int average = openedBottles / 3;
        System.out.println("Average of bottles that need opened to win is: " + average);
        outFile.close();
        
        Scanner inFile = new Scanner("trails.txt");
        while(inFile.hasNextLine())
        {
            String t = inFile.nextLine();
            System.out.println(t);
        }
        
        inFile.close();
    }
}
