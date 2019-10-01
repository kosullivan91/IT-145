//import the Scanner class to capture user input
import java.util.Scanner;

public class ParseStrings {

    public static void main(String[] args) {
        
        //instantiate a Scanner object for capturing user input
        Scanner scnr = new Scanner(System.in);
        
        //prompt the user for a String that contains two Strings
        //separated by a comma
        
        System.out.println("Enter input string: ");
        String userString = scnr.nextLine();
        
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
        
        //close the Scanner to conserve resources
        scnr.close();
        
        return; //return even when return type is void
                //to clear the stack frame
    }
}
