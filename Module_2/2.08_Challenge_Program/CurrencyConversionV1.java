
/**
 * Write a description of class CurrencyConversionV1 here.
 * 
 * 
 * ****************************************************P M R*****************************************************
 * (+s)I like to play with numbers, that help me to look this project more easy and take my attention.
 * 
 * (-s)was a little bit hard to understand the instructions and codes that give me from the begining but fainally
 * i solved.
 * **************************************************************************************************************
 * 
 * @author (Adrian Marimon) 
 * @version (10/26/2016)
 * 
 * 
 * 
 * @URL (themoneyconverter.com)--> this is the web site that i used to convert the money.
 */
public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;		// local variable for US Dollars
        double pesosSpentM = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRageM = 18.64;          // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollarsM = 0.0;        // local variable for US Dollars remaining, mexican pesos
        double yenSpentJ = 99939.75;             // local variable for US dollars remaining, Jappanese yen 
        double yenExchangeRageJ = 104.41;        // local variable for exchange rate of US Dollars to Yen 
        double remainingUsDollarsJ = 0.0;        // local variable for US dollars remaining 
        double euroSpentF = 624.95;              //local variable for for French euros Spent
        double euroExchangeRageF = 0.92;         // local variable for exchange rate of US to euro
        double remainingUsDollarsF = 0.0;        // locsl variable for us dollar remaining, French
            
        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        
        
        System.out.println("Starting US dollars:        " + startingUsDollars);
        // convertion for Mexican pesos
        remainingUsDollarsM = pesosSpentM / pesoExchangeRageM;
        System.out.println("US dollars spent in Mexico: " + remainingUsDollarsM);
        
        // convertion for Japanese yen
        remainingUsDollarsJ = yenSpentJ / yenExchangeRageJ;
        System.out.println("US dollars spent in Jappan: " + remainingUsDollarsJ);
        

        // convertion for Euros
        remainingUsDollarsF = euroSpentF / euroExchangeRageF;
        System.out.println("US dollars spent in France: " + remainingUsDollarsF);
        System.out.println("=====================================================================");
        startingUsDollars = startingUsDollars - remainingUsDollarsM - remainingUsDollarsJ - remainingUsDollarsF;
        System.out.println("Remaining Us dollars:       " + startingUsDollars);


		
		
         // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = 0; 		//how many items can be purchased
		double fundsRemaining1 = 0.0;  //how much of the budget is left
		
		totalItem1 = budget1 / costItem1;
		fundsRemaining1 = budget1 % costItem1;

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
		
		
		

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left
		
		
		totalItem2 = budget2 / (int)costItem2;
		fundsRemaining2 = budget2 % costItem2; 
		
		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);


    } // end of main method
} // end of class