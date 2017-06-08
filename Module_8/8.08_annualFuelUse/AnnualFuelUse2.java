
/**
 * Write a description of class AnnualFuelUse here.
 * 
 * @author (Adrian Marimon) 
 * @version (03/28/17)
 */
public class AnnualFuelUse2
{
    double usedG;
    double costG;
    double milesS;
    double milesE;
    
    
    AnnualFuelUse2(int fNum, double eMiles, double sMiles, double gUsed, double gCost)
    {
        milesS = sMiles;
        milesE = eMiles;
        usedG = gUsed;
        costG = gCost;
    }
    
    
    public double Distance()
    {
        return milesE - milesS;
    }
    
    public double getMPG()
    {
        return Distance() / usedG;
    }
    
    public double getGPM()
    {
        return usedG;
    }
    
    public double getTotalCost()
    {
        return costG * usedG;
    }
    
   
    
    public static double min(double min_max_V[])
    {
        
        Double minimunV = Double.MAX_VALUE;
       
        for(int i = 0; i < min_max_V.length; i++)
        {
            if (min_max_V[i] < minimunV)
            {
                minimunV = min_max_V[i];
            }
        }
        
        return minimunV;
    }
    
    
    public static double max(double min_max_V[])
    {
        Double maximunV = Double.MIN_VALUE;
        
        for(int i = 0; i < min_max_V.length; i++)
        {
            if(min_max_V[i] > maximunV)
            {
                maximunV = min_max_V[i];
            }
        }
        
        return maximunV;
    }

    
    public static double totalOf(double totalV[])
    {
       
        double totalValue = 0;
        
        for(double newV : totalV)
        {
            totalValue += newV;
        }
        
        return totalValue;
    }
    
    
    public static double annualProj(double days[], double annualV)
    {
        
        double totalValue = 0;
        
        for(double newV : days)
        {
            totalValue += newV;
        }
        return 365 / (totalValue - 1) * annualV;
    }
}
