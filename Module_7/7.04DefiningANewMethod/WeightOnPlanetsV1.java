
/**
 * Write a description of class WeightOnPlanetsV1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WeightOnPlanetsV1
{
    //find gravity
    public static double [] gravity () throws IOException
    {
        double gravity [] = new double[9];
        
        File name = new File("gravity1.txt");
        
        Scanner file = new Scanner(name);
        
        int i = 0;
        while(file.hasNext ())
        {
            gravity[i] = file.nextDouble();
            i++;
        }
        file.close();
        return gravity;
    }
    
    
    public static double [] pounds ( double weight[], double gravity[])
    {
        int i;
        for(i = 0; i < 9; i++)
        {
            weight[i] = (100 * gravity[i]) / 1.0;
        }
        return weight;
    }
    
    
    public static void print(double weight[], double gravity[], String planets[]) 
    {
        System.out.println("       My weight on the Planets");
        System.out.println("Planets         Gravity         Weight");
        
        int i;
        for(i = 0; i < 9; i++)
        {
            System.out.printf(planets[i] + "        %4.1f	%4.1f",gravity[i],weight[i]);
        }
    }
    
    
    public static void main () throws IOException
    {
        String [] planet = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
	    double gravities[] = gravity();
	    double[] weight = new double[9]; //initialize array
	    weight = pounds(gravities, weight);
	    print(gravities, weight, planet);
    }
}
