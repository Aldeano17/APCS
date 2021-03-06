
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // int variables
        int iNum1 = 35;
        int iNum2 = 9;
        int iNum3 = 16;
        int iNum4 = 225;
        int iNum5 = -18;
        int iNum6 = 7;
        
       // double variables 
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 5.0;
        
        
        
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + " plus " + iNum2 + " equals "); 
        System.out.println( iNum1 + iNum2 );
        System.out.print( dNum1 + " plus " + dNum2 + " equals ");
        System.out.println(dNum1 + dNum2); 
        
        
     
        // Subtraction
        System.out.println("Subtraction");
        System.out.print( iNum3 + " minus " + iNum2 + " minus " + iNum1 + " equals ");
        System.out.println(iNum3 - iNum2 - iNum1);
        System.out.print( dNum2 + " minus " + dNum3 + " equals " );
        System.out.println(dNum2 - dNum3);
        
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + " times " + iNum2 + " equals " + iNum4 ); 
        System.out.print(dNum2 + " times " + dNum3 + " times " + dNum3 + " equals ");
        System.out.println(dNum2 * dNum3 * dNum3);
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print( iNum2 + " divided by " + iNum1 + " equals ");
        System.out.println(iNum2 / iNum1);
        System.out.print( dNum1 + " divided by " + dNum3 + " equals ");
        System.out.println( dNum1 / dNum3);
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print( iNum3 + " modulus " + iNum2 + " equals ");
        System.out.println(iNum3 % iNum2);
        System.out.print( dNum3 + " modulus " + dNum2 + " equals ");
        System.out.println( dNum3 % dNum2 );
        //System.out.println();
        
        
        //My own arithmetic expressions
        System.out.println(" My own arithmetic expressions ");
        System.out.print(iNum1 + " divided by " + iNum6 + " equals ");
        System.out.println(iNum1 / iNum6);
        
        System.out.print(iNum3 + " times " + iNum4 + " equals ");
        System.out.println(iNum3 * iNum4);
        // 2.02 Lab Equations
        // 15 divided by 2.5 times -2 plus 10 / 5
        // 234 minus (234 divided by 6 modulus 12) + 3
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class