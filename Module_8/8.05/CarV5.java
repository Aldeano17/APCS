
/**
 * Write a description of class CarV5 here.
 * *********************************************************************************************************
 * 
 * *********************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (02/26/2017)
 */
import java.util.Scanner;
public class CarV5
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
       
       
      
       CarV5 carv5 = new CarV5();
       Car car = carv5.new Car("14 Toyota Corolla", 29364,29653, 3.0, 13.8);
       
       
       //calculate distance that the car run
       int distance = car.eMiles - car.sMiles;
       
       //calculate the distance per gallon 
       double mPerGallon = distance / car.gUsed;
       
       //calculate total cost
       double total = car.gUsed * car.gCost;
       
       
       //gallons per miles
       double GPM = distance / car.gUsed;
       
        System.out.printf("%16s%16s%16s%16s%16s%16s%16s%16s%16s\n","Type of Car","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gal/Mile");
        System.out.print("===============================================================================================================================================\n");
        System.out.printf("%15s%13d%16d%16d%16.1f%16.1f%16.1f%16.1f%16.3f\n",car.name, car.sMiles, car.eMiles, distance, car.gUsed, car.gCost, total, mPerGallon, GPM);
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