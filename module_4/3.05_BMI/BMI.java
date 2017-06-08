
/**
 * Write a description of class g here.
 * 
 * *****************************************************************************************************
 * (+s) I learn how convert from strings to doubles. And i am still geting experience with the if 
 * statements
 *  
 *   
 * *****************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (11/26/2016)
 */

import java.util.Scanner;
public class BMI
{
    public static void main(String [ ] args)
    {
        Scanner in = new Scanner(System.in);
    
        //First & Last Name
        System.out.print("First & Last Name: ");
        String name = in.nextLine();
        System.out.println(name);
        
        
        //Height in feet
        System.out.print("Height in ft and inches (e.g. 5 11): ");
        String ft = in.next();
        String inches = in.next();
        System.out.println(ft + " " + inches);
        
        
        //Weight in pounds
        System.out.print("Weight in pounds (e.g.175): ");
        String lb = in.next();
        System.out.println(lb);
        
        
        System.out.println();
        System.out.println();
        
        //Parse Strings
        double feet = Double.parseDouble(ft);
        double Inches = Double.parseDouble(inches);
        double pounds = Double.parseDouble(lb);
        
        
        //Conversions
        double height = (feet * 12) + Inches;
        double kg = pounds * .45;
        double meters = height * .025;
        
        
        //Calculate BMI
        double BMI = kg/(meters *meters);
        //Determine how is the weight
        String target;
        if(BMI < 18.5)
            target = "Under Weight";
        else if(BMI > 25)
            target = "Over Weight";
        else
            target = "optional";
            
        
            
        System.out.println("Body Mass Index Calculator");
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + meters);
        System.out.println("Weight (kg)" + kg);
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + target);
     } 
}    

