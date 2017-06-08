
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SalaryV2
{
    public static void main(String[] args)
    {   
        double totalSalary;
        Scanner in = new Scanner(System.in);
    
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.next();
        
        System.out.print("\nWhat is your hourly rate of pay: ");
        String rateOfPay = in.next();
        double payRate = Double.parseDouble(rateOfPay);
        
        System.out.print("\nHow many hours did you work: ");
        String totalHoursWorked = in.next();
        double totalHours = Double.parseDouble(totalHoursWorked);
        System.out.println();
        
        boolean isOvertime = totalHours > 40;
        
        if(isOvertime)
            totalSalary = 40 * payRate + (totalHours - 40) * payRate * 1.5;
        else
            totalSalary = totalHours * payRate;
        
        System.out.println("Employee Name: " + lastName + ", " + firstName);
        System.out.print("Hourse worked: " + totalHours);
        System.out.print("\t\tOvertime: " + isOvertime + "\n");
        System.out.println("Salary: " + totalSalary);    
    }
}
