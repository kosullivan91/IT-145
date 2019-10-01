//import the Scanner class to capture user input
import java.util.Scanner;

public class ParseStrings {

    public static void main(String[] args) {
        
        //instantiate a Scanner object for capturing user input
        
        Scanner scnr = new Scanner(System.in);
        
        //declare the Scanner object for the input string stream
        
        Scanner stringStream = null;
        
        //declare String variables for holding parsed words
        String firstWord;
        String secondWord;
        
        //prompt the user for a String that contains two Strings
        //separated by a comma, use a loop to handle multiple
        //line of input.  Continue until the user enters 'q' to
        //quit.  A while loop is used as iteration entry is based on
        //user input and the number of iterations is unknown.
        
        System.out.println("Enter input string: ");
        String userString = scnr.nextLine();
        
        System.out.println(userString);
        
        //Loop until user enters 'q' or 'Q' to quit
        while(!userString.equals("q") && !userString.contentEquals("Q")) {
        
            /* The String object contains() method checks whether
             * a String contains another substring. It returns a boolean value 
             * that can be used directly inside if statements.
             * https://www.guru99.com/string-contains-method-java.html
             */
            
            boolean hasComma = userString.contains(",");
                        
            /* Report an error if the input string does not contain a comma. 
             * Continue to prompt until a valid string is entered.
             * Program assumes two separate Strings if userInput
             * contains a comma.
             * A while loop is used because the number of iterations
             * are unknown at the onset and are dependent
             * upon user input.
             * Loop while hasComma is false (i.e. userString has no comma).
             */
            
            while(!hasComma) {
                System.out.println("Error: No comma in string");
                System.out.println("Enter input string: ");
                userString = scnr.nextLine();
                hasComma = userString.contains(",");
            }
            
            //Add a space after the comma if one does not exist
            //for ease of parsing.
            
            boolean hasCommaSpace = userString.contains(", ");   
            
            if(!hasCommaSpace) {
                userString = userString.replace(",", ", ");
            }
                   
            //Extract the two words from the input String and remove spaces
            //Output the spaces
            
            //initialize the input string stream from userString
            stringStream = new Scanner(userString);
            
            //Extract the two words from the input string and remove spaces
            //chain the String replace() method to the parsed String
            //object returned by stringStream.next() to remove the comma
            
            firstWord = stringStream.next().replace(",", "");
            secondWord = stringStream.next();
            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
            
            System.out.println("Enter input string: ");
            userString = scnr.nextLine();
        }
                
        //close the Scanner objects to conserve resources
        scnr.close();
        stringStream.close();
        
        return; //return even when return type is void
                //to clear the stack frame
    }
}
