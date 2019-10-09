/* Jeff Perkinosn
 * IT-145-T1605
 * October 2019
 */

import java.util.InputMismatchException;
import java.util.Scanner;
//Import Java's Double class for input parsing and double type conversion
//to aide in input validation
import java.lang.Double;

public class Paint1 {

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

        final double squareFeetPerGallons = 350.0;
        boolean validHeight = true;            //boolean value to control do-while
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
            // catch (InputMismatchException excpt) {
            //     System.out.println("Input type mismatch " + excpt.getMessage());
            //     validHeight = false;
            // }
            catch (Exception excpt) {
                System.out.println("Bad value exception " + excpt.getMessage());
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
                
                //wallWidth = scnr.nextDouble();    //first error, replaced duplicate wallHeight assignment
                                                    //with wallWidth; this is commented out becasue the Double
                                                    //class is leverage for input validation, so this statment 
                                                    //is no longer needed, but remains for posterity to show
                                                    //one of the inital bug fixes in the program
                if(wallWidth <= 0) {
                    throw new Exception("Invalid width.");
                }
            }
            catch (InputMismatchException excpt) {
                System.out.println(excpt.getMessage());
                validWidth = false;
            }
            catch (Exception excpt) {
                System.out.println(excpt.getMessage());
                validWidth = false;
            }
        } while(!validWidth);
        
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");      //second error, wallArea variable
                                                                            //was not included in print statement

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");     //third error, incorrect identifier
                                                                                    //gallonspaintneeded replaced with
                                                                                    //gallonsPaintNeeded

        scnr.close();
        return;
    }
}
