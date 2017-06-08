
/**
 * Write a description of class CO2FootprintV1Tester here.
 * 
 * @author (Adrian Marimon) 
 * @version (04/24/17)
 */
public class CO2FootprintV1Tester
{
   private double metric = 0;
   private double gallonsG = 0;
   private double tsC = 0;
   private double math = (8.78 * Math.pow(10, -3));
   private double psC = 0;
   
   CO2FootprintV1Tester(double x)
   {
       gallonsG = x;
   }
   
   public void CO2EmissionsCalc()
   {
       metric = math * gallonsG; tsC = metric * 1.10231; psC = tsC * 2000;
   }
   
   public double PoundsC()
   {
       return psC;
   }
   
   public double TonsC()
   {
       return tsC;
   }
}
