
/**
 * Write a description of class TextMessageV1 here.
 * 
 * 
 * **************************************************P M R*********************************************
 * (+s) I learn how use some new methods that i never used before. 
 * 
 * (-s) Some methos that i need for this code i never used before and was not easy to work with them.
 * But my brother teach me how used.
 * ****************************************************************************************************
 * 
 * 
 * @author (Adrian Marimon) 
 * @version (11/04/2016)
 */
public class TextMessageV1
{
    public static void main(String [ ] args)
    {
        //psuedocode
        //1.Declare the message as a string object;
        //2.Implement the appropriate abbreviations into the selected phrases;
        //3.Print Message;
        
        //local variables
         String object = "i just remember that i have homework for my math class.";
         
         
        //Original Message
         System.out.println("Original Message:");
         System.out.println(object);
         
         //calculate length of object 
         int stringLength = object.length();
         System.out.println("Message Length: " + stringLength + " characters");
         System.out.println("");
   
        //New Message
        System.out.println("New Message: ");
        String c1 = Cad.replaceAll("have to go","");
        String p2 = p1.replaceAll("i have homework","IHHM");
        String p3 = p2.replaceAll("for my","FM");
        String p4 = p3.replaceAll("math","MT");
        String p5 = p4.replaceAll("class","CL"); 
        System.out.println(p5);
        
        //calcualting length of message 2
        int stringLength2 = p5.length();
        System.out.print("Message Length: " + stringLength2);
        System.out.print(" characters");
        System.out.println("");
        System.out.println("");
       
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
        System.out.print(p5.substring(44));
        System.out.println("");
        
        //replaceAll
        System.out.print("replaceAll RNLSTE's: "); 
        String p6 = p5.replaceAll("s","");
        String p7 = p6.replaceAll("c","");
        System.out.print(p7);   
        
        System.out.println();
        System.out.println();
    }
} 