/* Jeff Perkinson
 * IT-145 T1605
 * October 2019
 */ 


import java.util.Scanner;

//import the Math class from java.lang package
//to use Math.ceil() for determining the number of cans
//needed.

import java.lang.Math;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded = 0.0;    //initialize to 0.0 for readability
                                    //and to eliminate ambiguity

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

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

