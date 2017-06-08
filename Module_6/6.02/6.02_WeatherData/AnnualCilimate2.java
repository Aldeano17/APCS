
/**
 * **************************************************************************************************
 * (+s) was really hard for me to understand how work with the new printf. i spend almost the all day 
 * just in this excercice and i finally i finished. the good thing is that i now how work printf 
 * already
 * 
 * **************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/07/16)
 */

import java.util.Scanner;
public class AnnualCilimate2
{
   public static void main(String [] args)
   {
       Scanner in = new Scanner(System.in);
       
       String month [] = {"Jan.","Feb.","Mar.","Apr.","May.","Jun.","Jul.","Aug.","Sep.","Oct.","Nov.","Dec."};

       double temperature [] = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 52.5, 81.1, 75.3, 68.8, 63.0}; 
       double precipitation [] = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
       
       double sum1 = 0.0;
       double sum2 = 0.0;
       
       String unitT = "";
       String unitP = "";
       
       System.out.print("How do yo want the temperature scale (1 = Farenheit, 2 = Celsius ): ");
       int tChoice = in.nextInt();
       
       
       System.out.print("How do you want the precipitation scale (1 = inches, 2 = centimeters): ");
       int pChoice = in.nextInt();
       
       System.out.println();
       
       
       if(tChoice == 1)
       {
           unitT = "F";
       }
       else if(tChoice == 2)
       {
           for(int i = 0; i < 12; i++)
           {
                temperature[i] = temperature[i]-32;
                
                temperature[i] = (.555)*(temperature[i]);
                
                temperature[i] = ((temperature[i]*10));
                
                temperature[i] = ((int)temperature[i]);
                
                temperature[i] = temperature[i]/10;
           }
           unitT = "C";
       }
       else
       {
           System.out.println("Error, your choice was not correct! Try again.");
       }
       
       if(pChoice == 1)
       {
           unitP = "in.";
       }
       else if(pChoice == 2)
       {
           for(int i = 0; i < 12; i++)
           {
               precipitation[i] = (precipitation[i]*2.54); 
              
               precipitation[i] = ((precipitation[i]*10));
               
               precipitation[i] = ((int)precipitation[i]);
               
               precipitation[i] = precipitation[i]/10;
           }
           unitP = "cm";
       }
        else
       {
           System.out.println("Error, your choice was not correct! Try again.");
       }
       
       for(int i = 0; i < 12; i++)
       {
           sum1 += temperature[i];
           sum2 += precipitation[i];
       }
       
       double averageT = sum1 / 12;
       double averageP = sum2;
       
       System.out.println("                 Climate Data");
       System.out.println("     Location: Orlando,  Florida ");
       
       System.out.println();
       
       System.out.printf("%8s%18s%24s\n", "Month", "Temperature " + unitT, "Precipitation " + unitP);
       
       System.out.println("************************************************************");
       
       for(int i = 0; i < 12; i++)
       {
           System.out.printf("%8s%13s%20s\n", month[i], temperature[i], precipitation[i]);
       }
       System.out.println("************************************************************");
       
       System.out.printf("%s %.1f %s %.1f", "       Average: ", averageT , "        Annual: ", averageP);
    }
}
