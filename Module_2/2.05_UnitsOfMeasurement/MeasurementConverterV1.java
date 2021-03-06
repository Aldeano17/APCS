 /**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * 
 * PROJECT TITLE: 02.05 Arithmetic Expressions
 * 
 * PURPOSE OF PROJECT: Converts to and from Metric and English units of measure.
 * 
 * @author B. Jordan
 * 
 * @version 01/19/07
 *
 * USER INSTRUCTIONS: Write a program that will convert between different units of measurement.
 * 
 * Modified by: (Adrian Marimon)
 * Date: (10/18/2016) 
 ******************************************** P M R ************************************************* 
 * <+s>: Is helping me a lot using BlueJ, I always forgot to put the (;) and BlueJ reminding me. 
 *
 * <-s>: Sometimes is a take longer to understand the intructions and take me a lot of time 
 * to complete the assignment.   
 ****************************************************************************************************
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        double kilometers;              //number in kilometers
        double kilometersPerMile = 1.61; //number of kilometers per 1 mile
        double pounds;                  //number in pounds
        double poundsPerKg = 2.2;        //number of pounds in kg
        double kg;                       //number in kilograms
        double gallons;                  //number in gallons
        double liters;                    //number in liters
        double litersPerGallon = 3.79;           //number of liters per gallon
        double inches;                    //number in inches
        double inchesPerFeet = 12;             //number of inches per feet
        
        
        System.out.println( "********************************************************************* ");
        System.out.println("    This program converts between selected units of measurement.    ");
        System.out.println( "********************************************************************* ");
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        System.out.println("Feet to Miles");
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");
        System.out.println();


        //convert miles to feet
        System.out.println("Miles to Feet");
        miles = 2.1;
        feet = miles * feetPerMile;
        System.out.println(miles + " mi. = " + feet + " ft. ");
        System.out.println();
        
        
        //convert miles to kilometers
        System.out.println("Miles to Kilometers");
        miles = 3.25;
        kilometers = miles * kilometersPerMile;
        System.out.println(miles + "mi. = " + kilometers + " kilometers. ");
        System.out.println();
        
        
        //convert kilometers to miles
        System.out.println("Kilometers to Miles");
        kilometers = 5554.21;
        miles = kilometers / kilometersPerMile;
        System.out.println(kilometers + " kilometers. = " + miles + " mi. ");
        System.out.println();
        
        
        
        //convert pounds to kilograms
        System.out.println("Pounds to Kg");
        pounds = 3.1;
        kg = pounds / poundsPerKg;
        System.out.println(pounds + " pounds. = " + kg + " kg ");
        System.out.println();
        
        
        
        //convert kilograms to pounds
        System.out.println("Kg to Pounds");
        kg = 43.02;
        pounds = kg * poundsPerKg;
        System.out.println(kg + " kg. = " + pounds + " pounds. ");
        System.out.println();
        
        
        
        //convert gallons to liters
        System.out.println("Gallons to Liters");
        gallons = 3.5;
        liters = gallons * litersPerGallon;
        System.out.println(gallons + " gallons. = " + liters + " liters. ") ;
        System.out.println();
        
        
        
        //convert liters to gallons 
        System.out.println("Liters to Gallons");
        liters = 6000.5;
        gallons = liters / litersPerGallon;
        System.out.println(liters + " liters = " + gallons + " gallons. ");
        System.out.println();
        
        
        //convert feet to inches
        System.out.println("Feet to Inches");
        feet = 5.3;
        inches = feet * inchesPerFeet;
        System.out.println(feet + " feet. = " + inches + " inches. ");
        System.out.println();
        
        
        //convert inches to feet
        System.out.println("Inches to Feet");
        inches = 59.43;
        feet = inches / inchesPerFeet;
        System.out.println(inches + " inches = " + feet + " ft. ");
    }//end of main method
}//end of class
