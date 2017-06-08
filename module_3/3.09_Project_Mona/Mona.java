
/**
 * Write a description of class Mona here.
 * 
 * @author (Adrian Marimon) 
 * @version (11/09/2016)
 * *******************************************************************************************************
 *  (+s) is really good and easy to work with Scanner methods. With this programers can make things really 
 *  cool.
 *  
 *  (-s) in the book title i can't found how put more than 1 word and if i put 2 or more just recognice the 
 *  second for the next in.next() 
 * *******************************************************************************************************
 */
import java.util.Scanner;
public class Mona
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      
      //enter name
      System.out.print("Enter the name (Last, First): ");
      String lastName = in.next();
      String firstName = in.next();
      System.out.println(lastName + " " +firstName);
      System.out.println();
      System.out.println();
      
      //phone number
      System.out.print("Enter the phone number: ");
      String phoneNumber = in.next();
      System.out.println(phoneNumber);
      System.out.println();
      System.out.println();
      
      //Book title
      System.out.print("Enter the title of the book: ");
      String bookTitle = in.next();
      System.out.print(bookTitle);
      System.out.println();
      System.out.println();
      
      //Checked out
      System.out.print("Enter the date checked out (mm/dd/yyyy): ");
      String checkedOutDate = in.next();
      System.out.println(checkedOutDate);
      System.out.println();
      System.out.println();
      
      //Days Late
      System.out.print("Days Late: ");
      String daysLate = in.next();
      System.out.println(daysLate);
      System.out.println();
      
      //Daily Fine
      System.out.print("Daily Fine: ");
      String dailyFine = in.next();
      System.out.println(dailyFine);
      System.out.println();
      System.out.println();
      
      
      //Calculate the late fees
      int lateDays = Integer.parseInt(daysLate);
      double fineDaily = Double.parseDouble(dailyFine);
      double lateFees = (lateDays * fineDaily);
      System.out.println("Total Fee: ");
      System.out.print(lateFees);
      System.out.println();
      System.out.println();
      
      System.out.print("To: ");
      System.out.print(lastName+firstName);
      System.out.print("    ");
      String emailPart1 = firstName.substring(0,5);
      String emailPart2 = phoneNumber.substring(4,8);
      System.out.print("(" + lastName + emailPart1 + emailPart2 + "@csamediacenter.com" + ")");
      System.out.println();
     
      
      System.out.print("From: Mona  (mona@csamediacenter.com)");
      System.out.println();
      System.out.print("Subject: Overdue Notice");
      System.out.println();
      
      System.out.println("===================================================================");
      System.out.println();
      
      System.out.print(bookTitle); 
      System.out.print(" was checked out on: "); 
      System.out.print(checkedOutDate);
      System.out.println();
      
      System.out.print("This book is currently ");
      System.out.print(daysLate);
      System.out.print(" days late.");
      System.out.println();
      
      System.out.print("Your fine has accumulated to: ");
      System.out.print("$" + lateFees + " dollar(s)");  
  }
}
