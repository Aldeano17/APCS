
/**
 * Write a description of class Co2FroElectricity here.
 * 
 * @author (Adrian Marimon) 
 * @version (05/05/2017)
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Co2FroElectricity
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Double>electricity = new ArrayList<Double>();
        DecimalFormat decimal = new DecimalFormat(".##");
        
        System.out.print("Average monthly electricity  bill: ");
        electricity.add(in.nextDouble());
        
        System.out.println();
        
        System.out.print("Average price per kilowatt");
        electricity.add(in.nextDouble());
        
        in.close();
        
		CO2FromElectricityTester c = new CO2FromElectricityTester(electricity.get(0), electricity.get(1));

		
        c.CO2E();
        
        
        System.out.println();
        
        System.out.println("Average Monthly Electricity Bill:      " + decimal.format(c.Bill()));
		System.out.println("Average Monthly Electricity Price:     " + decimal.format(c.price()));
		System.out.println("Annual CO2 Emmisions from Electricity Usage: " + decimal.format(c.emision()) + " pounds");
    }
}
