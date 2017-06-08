
/**
 * Write a description of class m here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SingleCharacterInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Do you live in Florida (Y/N)? ");
        String liveInFlorida = in.next();
        char resident = liveInFlorida.charAt(0);
        
        boolean isResident = resident == 'Y';
        
        if(isResident)
            System.out.println("Status: Florida Resident");
        else
            System.out.println("Status: Non-Resident");
       }
    }