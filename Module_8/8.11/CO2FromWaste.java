
/**
 * Write a description of class d here.
 * 
 * @author (Adrian Marimon) 
 * @version (05/16/2017)
 */
import java.util.ArrayList;                                   
public class CO2FromWaste
{
    
    private int householdNumber;
    boolean recyclingP,
    recyclingPlas,
    recyclingG,
    recyclingC;
    double totalWasteE,
    wasteDeduction,
    netWasteDeduction;
    
    
    CO2FromWaste(int numHousehold, boolean paper,boolean plastic, boolean glass, boolean cans)
    {
        householdNumber = numHousehold;
        recyclingP = paper;
        recyclingPlas = plastic;
        recyclingG = glass;
        recyclingC = cans;
    }
    
    
    public void calcTotalWasteE()
    {
        totalWasteE = householdNumber * 1018;
    }
    
    
    public double getTotalWasteE()
    {
        return totalWasteE;
    }
    
    
    public void calcWasteDeduction()
    {
        double a, b, c, d;
        
        if(recyclingP == true)
        {
            a = 184;
        }
       
        else
        {
            a = 0;
        }
        
        
        if(recyclingPlas == true)
        {
            b = 25.6;
        }
        
        else
        {
            b = 0;
        }
        
        
        if(recyclingG == true)
        {
            c = 46.6;
        }
        
        else
        {
            c = 0;
        }
        
        
        if(recyclingC == true)
        {
            d = 165.8;
        }
        else
        {
            d = 0;
        }
        
        wasteDeduction = householdNumber * (a + b + c + d);
    }
    
    
    public double getWaste()
    {
        return wasteDeduction;
    }
    
    
    public void cNetWasteDeduction()
    {
        netWasteDeduction = totalWasteE - wasteDeduction;
    }
    
    
    public double getNetWaste()
    {
        return netWasteDeduction;
    }
    
    
    public int householdNumber()
    {
        return householdNumber;
    }
    
    
    public boolean getrecyclingP()
    {
        return recyclingP;
    }
    
    
    public boolean getrecyclingPlas()
    {
        return recyclingPlas;
    }
    
    
    public boolean getrecyclingG()
    {
        return recyclingG;
    }
    
    
    public boolean getrecyclingC()
    {
        return recyclingC;
    }
}

