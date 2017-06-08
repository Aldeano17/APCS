
/**
 * Write a description of class BMR here.
 * 
 * 
 * *****************************************************************************************************
 * (+s) I m getting more experience with the booleans and if statements and is making me easier to work 
 * with them.
 * 
 * 
 * (-s)-------------
 * 
 * *****************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (11/24/2016)
 */

import java.util.Scanner;
public class BMR
{
    public static void main(String [ ] args)
    {
        Scanner in = new Scanner(System.in);
        
        
        double BMR;
        
        
        //Ask for the first name
        System.out.print("Enter your first name: ");
        String name = in.next();
        System.out.println(name);
        
        
        //Ask for the gener 
        System.out.print("Enter your gener (M or F): ");
        String gender = in.next();
        System.out.println(gender);
        
        
        //Ask for the age
        System.out.print("Enter your age: ");
        String age = in.next();
        System.out.println(age);
        
        
        //Ask for the height in inches
        System.out.print("Enter your height in inches: ");
        String height = in.next();
        System.out.println(height);
        
        
        //Ask for the eight in pounds
        System.out.print("Enter your weight in pounds: ");
        String weight = in.next();
        System.out.println(weight);
        
        
        System.out.println();
        System.out.println();
        
        
        
        //Convert From String to Integer
        int Age = Integer.parseInt(age);
        int Height = Integer.parseInt(height);
        int Weight = Integer.parseInt(weight);
        
        
        
        
        //Unit Conversions
        double KgPerLbs = 0.45; 
        double kg = Weight * KgPerLbs;
        
        
        double cmPerInches = 2.54;
        double cm = Height * cmPerInches;
        
        
        //Male or Woman to calculate BMR
        char Gender = gender.charAt(0);
        
        boolean male = Gender == 'M';
        
        if(male)
            BMR = (10 * kg + 6.25 * cm - 5 * Age + 5);
            
        else
            BMR = (10 * kg + 6.25 * cm - 5 * Age - 161);
            
        
            
        System.out.println("Calculate Your Basal Metabolism");
       
        System.out.println();
        
        System.out.print("Name: ");
        System.out.println(name);
        System.out.println();
        
        System.out.print("Gender: ");
        System.out.println(gender);
        System.out.println();
        
        System.out.print("Age: ");
        System.out.println(age);
        System.out.println();
        
        System.out.print("Weight (kg): ");
        System.out.println(kg);
        System.out.println();
        
        System.out.print("Height (cm): ");
        System.out.println(cm);
        System.out.println();
        
        System.out.println("Basal Metabolic Rate: " + BMR + "Calories per Day");

        
    }
}
