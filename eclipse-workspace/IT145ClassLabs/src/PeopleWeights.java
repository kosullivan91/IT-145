import java.util.Scanner;

public class PeopleWeights {

    public static void main(String[] args) {
        
        /* Program variables:
         * Create a Scanner object to capture user input
         * Declare a final int variable to serve as the array length; declaring
         * array length based on an int variable makes array size modification
         * simple through changing one line of code only.
         * Declare a totalWeight double to capture the sum of all input and 
         * initialize it to 0.0.
         * Declare an averageWeight double to capture the average of all input and
         * initialize it to 0.0. 
         * Declare the maxWeight double to capture the max value input and
         * initialize it to 0.0. 
         */
        
        Scanner scnr = new Scanner(System.in);
        final int NUM_OF_ELEMENTS = 5; // The assignment calls for an array of length 5.
        double[] peopleWeight = new double[NUM_OF_ELEMENTS];
        double totalWeight = 0.0;
        double averageWeight = 0.0;
        double maxWeight = 0.0;
        
        /* Prompt the user to enter five numbers.  Store the input in an array of doubles.
         * Doubles array peopleWeight was declared above.  The user is prompted for input
         * five times, so the number of iterations is known (i.e. array length).  A for loop 
         * should therefore be used in lieu of a while loop.
         * Iterate from 0 up to the array length (exclusive) to account for all element
         * indices (as indices start at 0 and continue to one less than the array length).  
         */
                
        for (int i = 0; i < peopleWeight.length; ++i) {
            System.out.println("Enter weight " + (i + 1) + ": ");
            //Assign the user input to the array element at each iteration's index.
            peopleWeight[i] = scnr.nextDouble();
            //Add the element value at each iteration's index to totalWeight.
            totalWeight += peopleWeight[i];
        }
        System.out.println("");
        
        /* Output the array's numbers on one line, each number followed by one space.
         * Just as above, a for loop is used because the number of iterations is known.
         * Iterate from 0 up to the array length (exclusive) to account for all element
         * indices.
         */
        
        System.out.print("You Entered: ");        
        for (int i = 0; i < peopleWeight.length; ++i) {
            System.out.print(peopleWeight[i] + " ");
        }
        System.out.println("");
        
        //Output the total weight (i.e. the sum of all array elements).
        System.out.println("Total weight: " + totalWeight);
        
        /* Output the average weight.
         * The divisor should be the length of the array to ensure it's reflective of the
         * true average should the array's size change.
         */
        averageWeight = totalWeight / peopleWeight.length;
        System.out.println("Average weight: " + averageWeight);
        
        /* Determine and output the max weight.
         * maxWeight should be initialized to the first element
         * in the array for comparison to ensure each comparison
         * is done against true input that is housed in the array.
         * Just as above, a for loop is used because the number of iterations is known.
         * Iterate from 0 up to the array length (exclusive) to account for all element
         * indices.  For each iteration, compare maxWeight to the element at the 
         * given index.  If maxWeight is less, replace it with the larger value. 
         */
        maxWeight = peopleWeight[0];
        for (int i = 0; i < peopleWeight.length; ++i) {
            if (maxWeight < peopleWeight[i]) {
                maxWeight = peopleWeight[i];
            }
        }
        System.out.println("Max weight: " + maxWeight);
        
        // Close the Scanner object to conserve resources
        scnr.close();
        
        return;

    }

}
