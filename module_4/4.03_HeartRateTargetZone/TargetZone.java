
/**
 * Write a description of class TargetZone here.
 * 
 * 
 * *******************************************************************************************************
 * (+s) In this project i learn how convert a String to a Integer
 * 
 * 
 * (-s) Was not easy understand the formula but finally i got it. 
 *
 * *******************************************************************************************************
 * 
 * @author (Adrian Marimon) 
 * @version (11/24/2016)
 */

import java.util.Scanner;
public class TargetZone
{
    public static void main(String [ ] args)
    {
        String target = "within";
        
        Scanner in = new Scanner(System.in);
        
        
        
        Integer s = 220; 

        
        System.out.println("Determine Your Target Heart Rate Zone for Cardiovascular Exercise (65% - 85%)");
        System.out.println();        
        
        //Age
        System.out.print("Enter your age: ");  //print 
        String age = in.next();
        System.out.println(age);
        
        
        //Heart Rate
        System.out.print("Enter your resting heart rate: ");
        String RHR = in.next();
        System.out.println(RHR);
        
        
        
        //Resting Heart Rate after ex..
        System.out.print("Enter resting heart rate after exercising: ");
        String RHRAE = in.next();
        System.out.println(RHRAE);
        
        
        System.out.println();
        System.out.println();
        
        //Calculate Target Heart Rate Zone
        int Age = Integer.parseInt(age);
        int rhr = Integer.parseInt(RHR);
        int rhrae = Integer.parseInt(RHRAE);
        
        
        int MaxHR = s - Age;
        int HRR = MaxHR - rhr;
        double TRMin = ((HRR * .65) + rhr);
        double TRMax = ((HRR * .85) + rhr);
        
        
        //Determine if heart rate after exercise is between the min and max


        boolean isWithin = rhrae >= TRMin;
        if(isWithin)                                             
            target = "Within";
        //If the heart rate is below, change the value of target to "below".
        boolean isBelow = rhrae <= TRMin;
        if(isBelow)
           target = "Below";
       //If the heart rate is above, change the value of target to "above".
        boolean isAbove = rhrae >= TRMax;
        if(isAbove)
           target = "Above";
        //Print two output statements
        //The first stating the heart rate target zone
        System.out.print("Your heart rate target zone is between "+ TRMin);
        System.out.print(" and " + TRMax);
        System.out.println("");
        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. The variable "target" will have a value of within, above or below
        System.out.print("After exercising, your heart rate is " + target);
        System.out.print(" your target zone"); 
    
    
    }
}
