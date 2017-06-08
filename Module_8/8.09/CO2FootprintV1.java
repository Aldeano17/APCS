
/**
 * Write a description of class CO2FootprintV1 here.
 * *************************************************************************************************************
 *  this wasn't hard to do. But i am having some trouble at the time to use one class inside another class
 * *************************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (04/24/17)
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CO2FootprintV1
{
    public static void main(String[] args)
    {
        DecimalFormat four = new DecimalFormat(".####");
        Scanner in = new Scanner(System.in);
        System.out.println("How many tanks you wish to calculate C02 Emissions: ");
        int tks = in.nextInt();
        double [] gTotal = new double[tks];
        
        
        for(int i = 0; i < tks; i++)
        {
            System.out.println("How many gallons do you need per year for a tank?");
            gTotal[i] = in.nextDouble();
        }
        
        double [] ts = new double[tks];
        double [] ps = new double[tks];
        CO2FootprintV1Tester[] calc = new CO2FootprintV1Tester[tks];
        
        for(int i = 0; i < calc.length; i++)
        {
            calc[i] = new CO2FootprintV1Tester(gTotal[i]);
        }
        
        for(int i = 0; i < calc.length; i++)
        {
            calc[i].CO2EmissionsCalc();
        }
        
        for(int i = 0; i < calc.length; i++)
        {
            ts[i] = calc[i].TonsC();
            ps[i] = calc[i].PoundsC();
        }
        
        for(int i = 0; i < calc.length; i++)
        {
            System.out.println("                         CO2 Emissions");
            System.out.println("Gallons of Gas           Tons from Gas           Pounds from Gas");
            System.out.println("****************************************************************");
            System.out.printf("%7.1f%26.2f%28.3f%n", gTotal[i], ts[i], ps[i]);
        }
        
        in.close();
    }
}
