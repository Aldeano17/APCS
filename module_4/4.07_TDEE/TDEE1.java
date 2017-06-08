
/**
 * Write a description of class TDEE here.
 * 
 * ********************************************************************************
 *  (+s) I never imagine that we can put if and else statements inside anothers 
 *  if and else-if sttement 
 *  
 *  (-s)-------
 * ********************************************************************************
 * @author (Adrian Marimon) 
 * @version (11/29/2016)
 */

import java.util.Scanner;
public class TDEE1
{
   public static void main(String [] args)
   {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter your name: ");
       String name = in.nextLine();
       System.out.println(name);
       
       System.out.print("Enter your BMR: ");
       double BMR = in.nextDouble();
       System.out.println(BMR);
       
       System.out.print("Enter your gender (M or F): ");
       String gender = in.next();
       System.out.println(gender);
       
       System.out.println();
       System.out.println();
       
       System.out.println("Select Your Activity Level");
       System.out.println("[0] Resting (Sleeping, Reclining)");
       System.out.println("[1] Sedentary (Minimal Movement)");
       System.out.println("[2] Light (Sitting, Standing)");
       System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
       System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
       System.out.println("[5] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
       int activityLevelChoice = in.nextInt();
       
       System.out.println();
       
       System.out.println("Enter the letter corresponding to your activity level:3");
       
       
       double activityFactor = 0;
       
       if(activityLevelChoice == 0)
       {
           activityFactor = 1.0;
       }
       
       
       else if(activityLevelChoice == 1)
       {
           activityFactor = 1.3;
       }
       
       else if(activityLevelChoice == 2)
       {
           if(gender.equalsIgnoreCase("m"))
           {
               activityFactor = 1.6;
           }
           
           else 
           {
               activityFactor = 1.5;
           }
       }
      
       else if(activityLevelChoice == 3)
       {
           if(gender.equalsIgnoreCase("m"))
           {
               activityFactor = 1.7;
           }
           else
           {
               activityFactor = 1.6;
           }
       }
      
       else if(activityLevelChoice == 4)
       {
           if(gender.equalsIgnoreCase("m"))
           {
               activityFactor = 2.1;
           }
           else
           {
               activityFactor = 1.9;
           }
       }
       
       else if(activityLevelChoice == 5)
       {
           if(gender.equalsIgnoreCase("m"))
           {
               activityFactor = 2.4; 
           }
           else
           {
               activityFactor = 2.2;
           }
       }
       else
       {
           System.out.println("Invalid activity level choice!");
       }
       
       
       double tdee =  BMR * activityFactor;
       
       System.out.println("Name: " + name + "   Gender: " + gender);
       System.out.println("BMR: " + BMR + "   Activity Factor: " + activityFactor);
       System.out.println("TDEE: " + tdee);
    }
}