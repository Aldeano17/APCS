
/**
 * Write a description of class HeatIndex here.
 * ******************************************************************************************************************************************************************************************************
 * (+s) Each class the assigment is getting more hard. I have some trouble trying to organice my ideas but i finished. This is a good experience for next classes
 * 
 * 
 * ******************************************************************************************************************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (12/08/2016)
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class HeatIndex
{
        public static void main(String [] args) throws IOException
        {
            File fileT = new File("KeyWestTemp.txt");
            File fileH = new File("KeyWestHumid.txt");
            
            Scanner inFileTemp = new Scanner(fileT);
            Scanner inFileHumid = new Scanner(fileH);
            
            String month [] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
             
            int length = month.length;
            double temperature [] = new double[length];
            
            int humidity [] = new int[length];
            double HI [] = new double[length];
            
            int n = 0;
            
            while(inFileTemp.hasNextDouble())
            {
                temperature[n] = inFileTemp.nextDouble();
                
                n++;
            }
            
            n = 0;
            while(inFileHumid.hasNextDouble())
            {
                humidity[n] = inFileHumid.nextInt();
                
                n++;
            }
            inFileHumid.close();
            
            
            double temp = 0.0;
            int humid = 0;
            
            for(n = 0; n < HI.length; n++)
            {
                if(temperature[n] >= 80.0)
                {
                    temp = temperature[n];
                    humid = humidity[n];
                    
                    HI[n] = -42.379 + 2.04901523 * temp + 10.14333127 * humid - 0.22475541 * temp * humid - 6.83783 * (Math.pow(10, -3)) * (Math.pow(temp, 2)) - 5.481717 * (Math.pow(10, -2)) * (Math.pow(humid, 2)) + 1.22874 * (Math.pow(10, -3)) * (Math.pow(temp, 2)) * humid + 8.5282 * (Math.pow(10, -4)) * temp * (Math.pow(humid, 2)) - 1.99 * (Math.pow(10, -6)) * (Math.pow(temp, 2)) * (Math.pow(humid, 2));
                }
                
                else
                {
                    HI[n] = temperature[n];
                }
            }
            
            
            double sumT = 0.0;
            double sumH = 0;
            double sumHI = 0.0;
            
            for(n = 0; n < temperature.length; n++)
            {
                sumT += temperature[n];
            }
            double averageT = sumT / temperature.length;
            
            
            for(n = 0; n < humidity.length; n++)
            {
                sumH += humidity[n];
            }
            double averageH = sumH / humidity.length;
            
            for(n = 0; n < HI.length; n++)
            {
                sumHI += HI[n];
            }
            double averageHI = sumHI / HI.length;
            
            System.out.println("                                                Heat Index: Key West, Florida");
            System.out.println();
            
            System.out.print("Months");
            System.out.print("              ");
            
            for(String m : month)
            {
                System.out.printf("     %3.3s", m);
            }
            
            System.out.println("        Average");
            System.out.println("****************************************************************************************************************************************************************");
            
            System.out.print("Temp (F)");
            System.out.print("             ");       
            for(double t : temperature)
            {
                System.out.printf("    %s", t);
            }
            System.out.printf("        %.1f",averageT);
            
            System.out.println();
            System.out.println();
            
            System.out.print("Humidity (%)");
            System.out.print("        ");
             for(int h : humidity)
            {
                System.out.printf("      %s", h);
            }
            System.out.printf("         %.1f", averageH);
            
            System.out.println();
            System.out.println();
            
            System.out.print("HI (F)      ");
            System.out.print("         ");
             for(double H : HI)
            {
                System.out.printf("    %.1f", H);
            }
            System.out.printf("        %.1f", averageHI);
            
            System.out.println();
            System.out.println("****************************************************************************************************************************************************************");
        }
    }