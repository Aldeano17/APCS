
/**
 * Write a description of class CarV3 here.
 * 
 * *******************************************************************
 * is hard to learn work with different class but i am working on that 
 * and is getting easier
 * *******************************************************************
 * 
 * @author (Adrian Marimon) 
 * @version (02/16/17)
 */

import java.util.Scanner;
public class carV3
{
    public class Car
    {
        int sMiles, eMiles;
        String name;
        double gUsed, gCost;
        
        
        public Car(String name, int sMiles, int eMiles, double gCost, double gUsed)
        {
            this.name = name;
            this.gUsed = gUsed;
            this.gCost = gCost;
            this.sMiles = sMiles;
            this.eMiles = eMiles;       
        }
    }
    
    
    public static void main(String [] args)
    {
       int sMiles, eMiles;
       String name;
       double gUsed, gCost;
       
       
      
       carV3 carv3 = new carV3();
       Car car = carv3.new Car("14 Toyota Corolla", 29364,29653, 3.0, 13.8);
       
       
       //calculate distance that the car run
       int distance = car.eMiles - car.sMiles;
       
       //calculate the distance per gallon 
       double mPerGallon = distance / car.gUsed;
       
       //calculate total cost
       double total = car.gUsed * car.gCost;
       
       
       //gallons per miles
       double GPM = distance / car.gUsed;
       
        System.out.printf("%16s%16s%16s%16s%16s%16s\n","Type of Car","Start Miles","End Miles","Distance","Gallons","Miles/Gal");
        System.out.print("========================================================================================================================\n");
        System.out.printf("%15s%15d%15d%16d%15.1f%15.1f\n",car.name, car.sMiles, car.eMiles, distance, car.gUsed, mPerGallon);
    }
    
     public static int cDistance(int sM, int eM)
    {
        return eM - sM;
    }
    
    public static double cMPG(int distance, int gallons)
    {
        return distance / gallons;
    }
    
    public static double cCost(double costPerGallons, int gallons)
    {
        return costPerGallons * gallons;
    }
    
    public static double cGPM(int gallons, int distance)
    {
        return gallons / distance;
    }
}
