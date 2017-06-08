/**
 * Write a description of class d here.
 * 
 * @author (Adrian Marimon) 
 * @version (05/16/2017)
 */
import java.util.ArrayList;                                   
public class CO2FromWasteTester
{
    public static void main(String [] args)
    {
        ArrayList<CO2FromWaste> householdE = new ArrayList<CO2FromWaste>();
       
        householdE.add(new CO2FromWaste(1, true, true, true, true));
        
        householdE.add(new CO2FromWaste(3, true, false, true, true));
        
        householdE.add(new CO2FromWaste(4, false, false, false, false));
        
        householdE.add(new CO2FromWaste(1, true, true, true, true));
        
        householdE.add(new CO2FromWaste(1, true, true, true, true));
        
        
        CO2FromWaste recordD;
        
        
        for(int index = 0; index < householdE.size(); index++)
        {
            recordD = householdE.get(index);
        
            recordD.calcTotalWasteE();
            recordD.calcWasteDeduction();
            recordD.cNetWasteDeduction();
        }
        
        System.out.println("|_______|________|_____ Household Waste Recycled _______|________  Pounds of CO2  __________|");
        System.out.println("|       |        |                                      |  Total   |            |    Net    |");
        System.out.println("| Index | People |  Paper  |  Plastic  | Glass |  Cans  | Emission | Reduction  |  Emission |");
        System.out.println("|-------|--------|---------|-----------|-------|--------|----------|------------|-----------|");

        for(int index = 0; index < householdE.size(); index++)
        {
            recordD = householdE.get(index);
            
            System.out.printf("|%4d   |%4d    |%6s   |%8s   | %5s | %6s | %8.2f | %10.2f |%9.2f  |%n",
            index, recordD.householdNumber(),
            String.valueOf(recordD.getrecyclingP()), String.valueOf(recordD.getrecyclingPlas()), String.valueOf(recordD.getrecyclingG()), String.valueOf(recordD.getrecyclingC()),
            recordD.getTotalWasteE(), recordD.getWaste(),
            recordD.getNetWaste());
        }
        
        System.out.println("|-------|--------|---------|-----------|-------|--------|----------|------------|-----------|");
    }
}