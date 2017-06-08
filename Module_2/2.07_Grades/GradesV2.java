
/**
 * Write a description of class GradesV2 here.
 * 
 * @author (Adrian Marimon) 
 * @version (10/23/16)
 * ******************************************** P M R ****************************************************** 
 * <+s>: In the begining was hart to organize the lines, but when i finally did the n = 1 was really easy
 * to do the others.
 *
 * <-s>: Was a little bit hart to find how can i do the operatins and print the decimals at the screen 
 * either i knew that i have to use parenthesis and double.
 ***********************************************************************************************************
 */
public class GradesV2
{
     public static void main(String[ ] args)
     {
         //local valiables
         int numTest = 0;    //counts number of tests 
         int testGrade = 0;  //individual test grade 
         int totalPoints = 0;    //total points for all tests
         double average = 0.0;   //average grade
         
         
         
         System.out.println("****************************************************************************************");
         
         System.out.println("                                         2.07 Grades                             ");
         
         System.out.println("****************************************************************************************");
         System.out.println();
         System.out.println();
         System.out.println();
         //calculate number of test
         
         // n = 1 
         testGrade =  97;           //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;         
         average = totalPoints / numTest;           //average of point on all tests
         System.out.print(" n = 1   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
         
         
         
         // n = 2
         testGrade = 79;            //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;
         average = totalPoints / numTest;           //average of point on all tests
         System.out.print(" n = 2   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
            
         
         
         
         // n = 3
         testGrade = 83;            //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;
         average = (double)totalPoints / (double)numTest;           //average of point on all tests
         System.out.print(" n = 3   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
         
         
         
         
         // n = 4
          testGrade = 88;           //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;
         average = (double)totalPoints / (double)numTest;           //average of point on all tests
         System.out.print(" n = 4   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
         
         
         
         
         // n = 5
         testGrade = 100;            //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;
         average = (double)totalPoints / (double)numTest;           //average of point on all tests
         System.out.print(" n = 5   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
         
         
         
         
         // n = 6
         testGrade = 60;           //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;
         average = (double)totalPoints / (double)numTest;           //average of point on all tests
         System.out.print(" n = 6   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
         
         
         
         
         // n = 7
         testGrade = 99;            //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;
         average = (double)totalPoints / (double)numTest;           //average of point on all tests
         System.out.print(" n = 7   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
         
         
         
         
         // n = 8
         testGrade = 81;           //test score
         totalPoints += testGrade;          //totalPoints = totalPoints + testGrade
         numTest++;
         average = (double)totalPoints / (double)numTest;           //average of point on all tests
         System.out.print(" n = 8   ");
         System.out.print("     New Test Grade: " + testGrade);         //printing the information
         System.out.print("     Total Points: " + totalPoints);
         System.out.println("   Average Score: " + average);
         System.out.println();
       } 
}
