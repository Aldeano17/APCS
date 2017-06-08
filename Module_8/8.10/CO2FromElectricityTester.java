/**
 * Write a description of class CO2FromElectricityTester here.
 * 
 * @author (Adrian Marimon) 
 * @version (05/05/2017)
 */
public class CO2FromElectricityTester
{
    
    //initialacing variables 
    private double CO2E= 0;
    private double aveP = 0;
    private double aveB = 0;
    private double CO2M = 1.37;
    
    CO2FromElectricityTester(double x, double y)
    {
        aveB = x;
        aveP = y;
    }
    
    //equation to find he emision
    public void CO2E()
    {
        CO2E = (aveB / aveP) * CO2M * 12;
    }
    
    public double emision()
    {
        return CO2E;
    }
    
    public double Bill()
    {
        return aveB;
    }
    
    public double price()
    {
        return aveP;
    }
}
