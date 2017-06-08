
/**
 * Write a description of class s here.
 * 
 * @author (Adrian Marimon) 
 * @version (11/07/2016)
 * 
 * *********************************************************P M R***************************************************************
 * (+s) this is the first time that  i have experience with Scanner methods and it's really interesting and if you use them 
 * in a creative and inteligent way can be really awesome.
 * 
 * (-s) are some scanner methods that have to be used carefully because one error will confuse the all code and don't go to 
 * how  we want to.
 * *****************************************************************************************************************************
 */
import java.util.Scanner; //imports scanner methods
public class TextMessageV2
{
    public static void main(String [ ] args)
    {
        //psuedocode
        //1.Declare the message as a string object;
        //2.Implement the appropriate abbreviations into the selected phrases;
        //3.Print Message;
        
        //local variables
         String object = "i just remember that i have hw for my math class.";
        
       
        //Original Message
         System.out.println("Original Message:");
         System.out.println(object);
         
         //calculate length of object 
         int stringLength = object.length();
         System.out.println("Message Length: " + stringLength + " characters");
         System.out.println("");
   
        //New Message
        System.out.println("New Message: " );
        String p1 = object.replaceAll("i just remeber that","IJRT");
        String p2 = p1.replaceAll("i have homework","IHHM");
        String p3 = p2.replaceAll("for ","F");
        String p4 = p3.replaceAll("math","MT");
        String p5 = p4.replaceAll("class","CL"); 
        System.out.println(p5);
        
        //calcualting length of message 2
        int stringLength2 = p5.length();
        System.out.print("Message Length: " + stringLength2);
        System.out.print(" characters");
        System.out.println("");
        System.out.println("");
        
        //User Inputted Message
        System.out.println("User inputted Message");
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String firstWord = in.next();
        String restOfLine = in.nextLine();
        System.out.println();
        
        System.out.println("First Word: " + firstWord);
        System.out.println();
        
        System.out.println("Rest Of The Sentence: " + restOfLine);
        String fullSentence = firstWord + restOfLine;
        System.out.println();
        
        System.out.println("Full Scentence: " + fullSentence);
        System.out.println();
        
        
        
        //Remplace a word from the sentence
        System.out.println("Please Enter A Single Word From the Sentence You Would Like to Remplace: ");
        String cambiarLaPalabra = in.next();
        System.out.println();
        
        System.out.println("Please enter what you would like to replace that word witth: ");
        String por = in.next();
        String cambio = object.replaceAll(cambiarLaPalabra, por);
        System.out.println();
        
        System.out.println(cambio);
        System.out.println();
        
        
       
        //String Method Samples 
        System.out.println("String Method Examples: ");
        
        //indexOf - Prints out zero
        System.out.print("indexOf 'i': ");
        System.out.print(p5.indexOf("i"));
        System.out.println("");
        
        //substring (two parameters)
        System.out.print("substring (two parameters): ");
        System.out.print(p5.substring(0,27));
        System.out.println("");

        //substring (one parameter)
        System.out.print("substring (one parameter): ");
        System.out.print(p5.substring(28));
        System.out.println("");
        
        //replaceAll
        System.out.print("replaceAll RNLSTE's: "); 
        String p6 = p5.replaceAll("s","");
        String p7 = p6.replaceAll("c","");
        System.out.print(p7);   
    }
} 