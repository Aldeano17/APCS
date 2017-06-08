
/**
 * Write a description of class AnnualFuelUseTester here.
 * 
 * @author (Adrian Marimon) 
 * @version (03/28/17)
 * *****************************************************************************************************************
 *
 *  i gest that is good now. thanks for the help.
 * 
   *****************************************************************************************************************
 */
public class AnnualFuelUseTester2
{
    public static void main(String [] args)
    {
        String [] kData = {"Fill Up", "  Days", "    Start Miles", "     End Miles", "   Distance", "    Gallons", "     Price", "     Cost", "      Miles/Gal"};
        
        int [] fNum = {1, 2, 3, 4};
        
        
        double [] daysSinceFill = {3, 6, 1, 5};
        
        int [] sMiles = {131823, 29364, 12940, 12940};
        
        int [] eMiles = {132194, 29697, 13267, 13267};
        
        double [] distance = new double[sMiles.length];
        
        double [] gUsed = {15.9, 17.3, 18.7, 18};
        
        double [] MPG = new double[sMiles.length];
        
        double [] GPM = new double[sMiles.length];
        
        double [] gCost = {2.83, 2.90, 2.73, 3.00};
        
        double [] total = new double[sMiles.length];
        
        
        AnnualFuelUse2 [] car = { new AnnualFuelUse2(fNum[0], eMiles[0], sMiles[0], gUsed[0], gCost[0]),
                                 new AnnualFuelUse2(fNum[1], eMiles[1], sMiles[1], gUsed[1], gCost[1]),
                                 new AnnualFuelUse2(fNum[2], eMiles[2], sMiles[2], gUsed[2], gCost[2]),
                                 new AnnualFuelUse2(fNum[3], eMiles[3], sMiles[3], gUsed[3], gCost[3])                              
                               };
                             
       
        for(int i = 0; i < car.length; i++)
        {
            distance[i] = car[i].Distance();
            MPG[i] = car[i].getMPG();
            GPM[i] = car[i].getGPM();
            total[i] = car[i].getTotalCost();
        }
        
        double totalMPGAve;
        double totalDaysSinceLastFill;
        
        
        
        //minimun
        double minimunD = AnnualFuelUse2.min(distance);
        double minimunMPG = AnnualFuelUse2.min(MPG);
        double minimunCost = AnnualFuelUse2.min(gCost);
        
        //maximun
        double maximunD = AnnualFuelUse2.max(distance);
        double maximunMPG = AnnualFuelUse2.max(MPG);
        double maximunCost = AnnualFuelUse2.max(gCost);
        
        
        //total calculation
        double totalD = AnnualFuelUse2.totalOf(distance);
        double totalGUsed = AnnualFuelUse2.totalOf(gUsed);
        double totalCost = AnnualFuelUse2.totalOf(total);
        double totalMPG = AnnualFuelUse2.totalOf(MPG) / MPG.length;
        totalDaysSinceLastFill = AnnualFuelUse2.totalOf(daysSinceFill) - 1;
        totalMPGAve = AnnualFuelUse2.totalOf(MPG) / MPG.length;
        
        //annual
        double annualD = AnnualFuelUse2.annualProj(daysSinceFill, totalD);
        double annualGUsed = AnnualFuelUse2.annualProj(daysSinceFill, totalGUsed);
        double annualCost = AnnualFuelUse2.annualProj(daysSinceFill, totalCost);
        double annualMPG = AnnualFuelUse2.annualProj(daysSinceFill, totalMPGAve) / totalDaysSinceLastFill;
        
        
        System.out.println("             Annual Gas MIleage Calculations");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        
        for(String info : kData)
        {
            System.out.print(info + "\t");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.printf("%3d%10.0f%15d%16d%13.0f%17.1f%15.1f%16.1f%18.1f%n", fNum[0], daysSinceFill[0], sMiles[0], eMiles[0], car[0].Distance(), gUsed[0], gCost[0], car[0].getTotalCost(), car[0].getMPG());
        System.out.printf("%3d%10.0f%15d%16d%13.0f%17.1f%15.1f%16.1f%18.1f%n", fNum[1], daysSinceFill[1], sMiles[1], eMiles[1], car[1].Distance(), gUsed[1], gCost[1], car[1].getTotalCost(), car[1].getMPG());
        System.out.printf("%3d%10.0f%15d%16d%13.0f%17.1f%15.1f%16.1f%18.1f%n", fNum[2], daysSinceFill[2], sMiles[2], eMiles[2], car[2].Distance(), gUsed[2], gCost[2], car[2].getTotalCost(), car[2].getMPG());
        System.out.printf("%3d%10.0f%15d%16d%13.0f%17.1f%15.1f%16.1f%18.1f%n", fNum[3], daysSinceFill[3], sMiles[3], eMiles[3], car[3].Distance(), gUsed[3], gCost[3], car[3].getTotalCost(), car[3].getMPG());
        
        System.out.println();
        System.out.println();
        
        System.out.printf("Min:%53.0f%33.2f%35.2f%n", minimunD, minimunCost, minimunMPG);
        System.out.printf("Max:%53.0f%33.2f%35.2f%n%n", maximunD, maximunCost, maximunMPG);
        System.out.printf("Totals:%50.0f%19.1f%29.2f%n", totalD, totalGUsed, totalCost);
        System.out.printf("Annual Projection:%39.0f%19.1f%29.2f%20.2f%n", annualD, annualGUsed, annualCost, annualMPG);
    }
}
