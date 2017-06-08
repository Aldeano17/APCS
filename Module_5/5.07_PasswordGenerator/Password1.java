
/**
 * Write a description of class Password here.
 * ************************************************************************************************************************
 *  (-s) was a confuse to work with to many if statements.
 *  
 *  (+s) i think would be easir to work if tatements now.
 * ************************************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/29/16)
 */

import java.util.Scanner;
import java.util.Random;

public class Password
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Random rNum = new Random();
        Random rSelect = new Random();
        
        String upperC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerC = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String punct = "~!@^(){}[]|?/<>:;";
        String password = "";
        
        System.out.println("        Password Generator Menu");
        System.out.println("*********************************************************");
        System.out.println("* [1] Lowercase letters                                 *");
        System.out.println("* [2] Lowercase & Uppercase letters                     *");
        System.out.println("* [3] Lowercase, Uppercase & Numbers                    *");
        System.out.println("* [4] Lowercase, Uppercase, Numbers, and Punctuation    *");
        System.out.println("* [5] Quit                                              *");
        System.out.println("*********************************************************");
        
        int selection = 7;
        while(selection <= 0 || selection >= 6 )
        {
            System.out.print("Enter Selection (1-5): ");
            selection = in.nextInt();
            if(selection <= 0 || selection >= 6)
            {
                System.out.println("Please select a number in the range!");
            }
        }
        
        if(selection == 5)
        {
            System.out.println("Thank you. Password Generator will exit now!");
        }
        
        else
        {
            System.out.print("Password Length (6 or more): ");
            int length = in.nextInt();
        
        
            int rIndex;
            int str;
            char letra;
        
            if(selection == 1)
            {
                for(int i = 1; i <= length; i++)
                {
                    rIndex = rNum.nextInt(26);
                    letra = lowerC.charAt(rIndex);
                    password += letra;
                }
            }
        
            else if(selection == 2)
            {
                for(int i = 1; i <= length; i++)
                {
                    rIndex = rNum.nextInt(26);
                    str = rNum.nextInt(2);
                    if(str == 0)
                    {
                        letra = lowerC.charAt(rIndex);
                        password += letra;
                    }
                    else
                    {
                        letra = upperC.charAt(rIndex);
                        password += letra;
                    }
                }
            }
        
            else if(selection == 3)
            {
                for(int i = 1; i <= length; i++)
                {
                    str = rNum.nextInt(3);
                    if(str == 0)
                    {
                        rIndex = rNum.nextInt(26);
                        letra = lowerC.charAt(rIndex);
                        password += letra;
                    }
                    else if(str == 1) 
                        {
                            rIndex = rNum.nextInt(26);
                            letra = upperC.charAt(rIndex);
                            password += letra;
                        }
                        else
                        {
                            rIndex = rNum.nextInt(10);
                            letra = num.charAt(rIndex);
                            password += letra;
                        }
                }
            }
        
            else if(selection == 4)
            {
                for(int i = 1; i <= length; i++)
                {
                    str = rNum.nextInt(4);
                    if(str == 0)
                    {
                        rIndex = rNum.nextInt(26);
                        letra = lowerC.charAt(rIndex);
                        password += letra;
                    }
                    else if(str == 1) 
                    {
                        rIndex = rNum.nextInt(26);
                        letra = upperC.charAt(rIndex);
                        password += letra;
                    }
                    else if(str == 2)
                    {
                        rIndex = rNum.nextInt(10);
                        letra = num.charAt(rIndex);
                        password += letra;
                    }
                    else
                    {
                        rIndex = rNum.nextInt(17);
                        letra = punct.charAt(rIndex);
                        password += letra;
                    }
                }
            }
        }
        
        System.out.println(password);
    }
}
