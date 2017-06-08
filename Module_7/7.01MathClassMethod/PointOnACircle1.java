
/**
 * Write a description of class PointOnACircle1 here.
 * *****************************************************************************************************
 *  (+s)it's the first time that i work with Math class and don't look to hard.
 *  
 * *****************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (01/02/2017)
 */
public class PointOnACircle1
{
    public static void main (String [] args)
    {
        // array of numbers
        double Num [] = {1.0, .9, .8, .7, .6, .5, .4, .3, .2, .1, 0.0, -.1, -.2, -.3, -.4, -.5, -.6, -.7, -.8, -.9, -1.0};
        
        //radius of the circle
        double r = 1.0;
        
        System.out.println("            Points On A Circle Of Radius 1.0");
        System.out.println("             x1       y1       x1       y2");
        System.out.println("******************************************************");
        
        //loop to print the num that are in the circle
        
        double y1;
        double y2 = 0.0;
        for(int i = 0; i < Num.length; i++)
        {
            y1 = Math.sqrt(Math.pow(r, 2) - Math.pow(Num [i], 2));
            
            
            if(y1 == 0.0)
            {
                y2 = y1;
            }
            else
            {
                y2 = (-y1);
            }
            
            System.out.printf("%15.2f%9.2f%9.2f%11.2f%n", Num[i], y1, Num[i], y2);
        }
        System.out.println("******************************************************");
    }
}
