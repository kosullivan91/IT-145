import java.util.Scanner;

public class PeopleWeights {

    public static void main(String[] args) {
        
        /* Program variables:
         * Create a Scanner object to capture user input
         * Declare a final int variable to serve as the array length; declaring
         * array length based on an int variable makes array size modification
         * simple through changing one line of code only. 
         */
        
        Scanner scnr = new Scanner(System.in);
        final int NUM_OF_ELEMENTS = 5; // The assignment calls for an array of length 5.
        double[] peopleWeight = new double[NUM_OF_ELEMENTS];
        
        /* Prompt the user to enter five numbers.  Store the input in an array of doubles.
         * Doubles array peopleWeight was declared above.  The user is prompted for input
         * five times, so the number of iterations is known.  A for loop should therefore 
         * be used in lieu of a while loop.  
         */
        
        for (int i = 0; i < peopleWeight.length; ++i) {
            
        }
        
        
        // Close the Scanner object to conserve resources
        scnr.close();
        
        return;

    }

}
