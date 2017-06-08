
/**
 * Write a description of class GuessingGameV1 here.
 * ********************************************************************************
 * (-s) was a cofuse that the computer always select a double starting by 0. but i 
 * can just multiply th number time 100 and convert to a int.
 * 
 * (+s) i am learning and getting experience with .random that i never used before.
 * ********************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/03/16)
 */

import java.util.Scanner;
public class GuessingGameV1
{
   public static void main(String [] args)
   {
       Scanner in = new Scanner(System.in);
       
       double rNum = Math.random();
       int Num = (int)(rNum * 100.0 + 1);
       int counter = 0;
       
       System.out.println("Guess a Number between 1 & 100: ");
       int guess = in.nextInt();
       
          
       while(guess != Num)
       {
           if (guess < Num)
           {
               System.out.println("Your # is too low!");
               System.out.print("Try again: ");
               counter++;
               guess = in.nextInt();
           }
           
           else
           {
               System.out.println("Your # is to high!");
               System.out.print("Try again: ");
               counter++;
               guess = in.nextInt();
           }
       }
       
       System.out.println("Congratulations, the # was: " + Num);
       System.out.println("Guesses: " + counter);
      
   }
}