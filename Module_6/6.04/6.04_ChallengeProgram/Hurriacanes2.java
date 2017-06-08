
/**
 * Write a description of class Hurriacanes2 here.
 * *********************************************************************************************************
 * (-s) I am having some probles with the numbers and i don't found why. I would like some help here.
 * 
 * (+s) Now is getting more easier to work with loops and if statements.
 * *********************************************************************************************************
 * @author (Adrian Marimon) 
 * @version (01/02/2017)
 */

import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class Hurriacanes2
{
   public static void main(String [] args) throws IOException
   {
       int aLength = 59;
       
       
       File file = new File("hurcdata2.txt");
       Scanner inFile = new Scanner(file);
       
       
       int year [] = new int [aLength];
       String month [] = new String [aLength];
       int pressure [] = new int [aLength];
       int wind [] = new int [aLength];
       String name [] = new String [aLength];
       int i = 0;
       while(inFile.hasNext())
       {
           year [i] = inFile.nextInt();
           month [i] =  inFile.next();
           pressure [i] = inFile.nextInt();
           wind [i] = inFile.nextInt();
           name [i] = inFile.next();
           i++;
       }
       
       int minPress = pressure [0];
       int minWind = wind [0];
       
       i = 0;
       inFile.close();
       
       
       double windMPH [] = new double[aLength];
       double windAve = 0;
       double pressureAve = 0;
       int category [] = new int[aLength];
       double categoryAve = 0;
       int category1 = 0;
       int category2 = 0;
       int category3 = 0;
       int category4 = 0;
       int category5 = 0;
       for(i = 0; i < wind.length; i++)
       {
           windMPH[i] = wind [i] * 1.15;
           windAve = wind [i];
           
           pressureAve += pressure [i];
           

           if(windMPH [i] > 74 && windMPH [i] < 95)
           {
               category [i] = 1;
               category1 ++;
            }
       
            else if(windMPH [i] > 96 && windMPH [i] < 110)
            {
                category [i] = 2;
                category2 ++;
            }
       
            else if(windMPH [i] > 111 && windMPH [i] < 129)
            {
                category [i] = 3;
                category3 ++;
            }
       
            else if(windMPH [i] > 130 && windMPH [i] < 156)
            {
                category [i] = 4;
                category4 ++;
            }
            else if(windMPH [i] >= 156)
            {
                category [i] = 5;
                category5 ++;
            }
            
           categoryAve += category [i];
       }
       
       int categoryMin = category [0]; 
       
       int windMax = 0;
       int windMin = 0;
       for(i = 0; i < wind.length; i ++)
       {
           if(wind [i] > windMax)
           {
               windMax = wind [i];
           }
           
            if(wind [i] < windMin)
           {
               windMin = wind [i];
           }
       }
       
       
       
       int pressureMax = 0;
       int pressureMin = 0;
       for(i = 0; i < pressure.length; i++)
       {
           if(pressure [i] > pressureMax)
           {
               pressureMax = pressure [i];
           }
           
            if(pressure [i] < pressureMin)
           {
               pressureMin = pressure [i];
           } 
       }
       
       
       
       int categoryMax = 0;
       for(i = 0; i < category.length; i++)
       {
           if(category [i] > categoryMax)
           {
               categoryMax = category [i];
           }
           
           if(category [i] < categoryMin)
           {
               categoryMin = category [i];
           }
       }
       
       
       System.out.println("                     Hurricanes 1980 - 2006");
       System.out.println("YEAR     HURRICANES      CATEGORY    PRESSURE(mb)        WIND SPEED(MPH)");
       System.out.println("**************************************************************************");
       
       for(i = 0; i < year.length; i++)
       {
            System.out.printf("%d%13s%10d%17d%26d\n" , year[i], name[i] , category[i] , pressure[i] , (int)windMPH[i]);
            
       }
       
       
       System.out.println("**************************************************************************");  
       
       windAve /= wind.length;
       pressureAve /= pressure.length;
       categoryAve /= category.length;
       
       
       System.out.printf("%s%20f%17f%26f\n" , "Average" , categoryAve , pressureAve , windAve);
       
       System.out.printf("%s%20d%17d%26d\n" , "Maximum" , categoryMax , pressureMax , windMax);
       
       System.out.printf("%s%20d%17d%26d\n" , "Minimum" , categoryMin , pressureMin , windMin);
       
       System.out.println();
       
       System.out.println("Number of Cateogry 1: " + category1);
       
       System.out.println("Number of Cateogry 2: " + category2);
       
       System.out.println("Number of Cateogry 3: " + category3);
       
       System.out.println("Number of Cateogry 4: " + category4);
       
       System.out.println("Number of Cateogry 5: " + category5);
       
       
       
   }
}
