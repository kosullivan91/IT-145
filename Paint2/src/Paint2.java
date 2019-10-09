/* Jeff Perkinson
 * IT-145 T1605
 * October 2019
 */ 


import java.util.Scanner;

//Import Java's Double class for input parsing and double type conversion
//to aide in input validation
import java.lang.Double;

//import the Math class from java.lang package
//to use Math.ceil() for determining the number of cans
//needed.

import java.lang.Math;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        //String variables needed to store user input for parsing
        //and conversion to type double for input validation
        String wallHeightAsString;
        String wallWidthAsString;

        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded = 0.0;    //initialize to 0.0 for readability
                                    //and to eliminate ambiguity

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;
        boolean validHeight = true;     //boolean value to control do-while
                                        //loop for user's wall height input

        boolean validWidth = true;      //boolean value to control do-while
                                        //loop for user's wall width input

        // Prompt user to input wall's height
        // Implement a do-while loop with try-catch to ensure input is valid and any exceptions are handled

        do {
            validHeight = true;
            try {
                System.out.println("Enter wall height (feet): ");
                //Store the input in a String for parsing and double type conversion
                wallHeightAsString = scnr.nextLine();
                //Convert user input to type double
                //If conversion does not occur an exception will
                //be thrown that is handled by the catch block
                wallHeight = Double.parseDouble(wallHeightAsString);
                
                if (wallHeight <= 0) {
                    throw new Exception("Invalid height.");
                }
            }
            catch (NumberFormatException excpt) {
                System.out.println("Do not enter String. " + excpt.getMessage());
                validHeight = false;
            }
            catch (Exception excpt) {
                System.out.println("Bad value exception. " + excpt.getMessage());
                validHeight = false;
            }
        } while (!validHeight);

        // Prompt user to input wall's width
        // Implement a do-while loop with try-catch to ensure input is valid and any exceptions are handled

        do {
            validWidth = true;
            try {
                System.out.println("Enter wall width (feet): ");
                //Store the input in a String for parsing and double type conversion
                wallWidthAsString = scnr.nextLine();
                //Convert user input to type double
                //If conversion does not occur an exception will
                //be thrown that is handled by the catch block
                wallWidth = Double.parseDouble(wallWidthAsString);
                
                if (wallWidth <= 0) {
                    throw new Exception("Invalid width.");
                }
            }
            catch (NumberFormatException excpt) {
                System.out.println("Do not enter String. " + excpt.getMessage());
                validWidth= false;
            }
            catch (Exception excpt) {
                System.out.println("Bad value exception. " + excpt.getMessage());
                validWidth = false;
            }
        } while (!validWidth);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        // Using Math.ceil() to complete this task
        /* Math.ceil() Takes in a value of type double and
         * returns the smallest value greater than or equal to 
         * the argument and is of type int.
         * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#ceil-double-
         */ 

         cansNeeded = Math.ceil(gallonsPaintNeeded);
         System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}