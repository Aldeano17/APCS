
/**
 * Write a description of class AnnualCimate1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.util.Scanner;
public class AnnualCimate1
{
    public static void main(String [] arg)
    {
        Scanner in = new Scanner(System.in);
        String city = "Orlando";
        String state = "Florida";
        
        String month [] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double temperature [] = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 52.5, 81.1, 75.3, 68.8, 63.0}; 
        double precipitation [] = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
       
        
        String tempL = "F";
        String precL = "in";
        
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempChoice = in.next();
        
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String precChoice = in.next();
        
        if(tempChoice == "C" || tempChoice == "c")
        {
           
        }
        
        if(precChoice == "Cm" || precChoice == "cm")
        {
            precipitation = precipitation * 2.54;
        }
        
        if(tempChoice.equalsIgnoreCase("C"))
        {
            tempL = "(C)";
            for(int index = 0; index < temperature.length; index++)
            {
            }
        }
        
        if(precChoice.equalsIgnoreCase("c"))
        {
            precL = "(cm)"; 
        }
        
        System.out.println();
        
        System.out.println("Climate Data");
        System.out.println("Location: " + city + ", " + state);
        System.out.printf("%5s %18s %s %18s %s", "Month", "Temperature", tempL, "Precipitation", precL);
        
        System.out.println();
        
        System.out.println("***********************************************************************");
        System.out.print(month[0] + "               ");
        System.out.print(temperature[0] + "                 ");
        System.out.println(precipitation[0]);
    }
}
