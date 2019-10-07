/* Jeff Perkinosn
 * IT-145-T1605
 * October 2019
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        final double squareFeetPerGallons = 350.0;
        boolean validHeight;            //boolean value to control do-while
                                        //loop for user's wall height input

        boolean validWidth;             //boolean value to control do-while
                                        //loop for user's wall width input

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        // Implement a do-while loop to ensure input is valid and any exceptions are handled
        do {
            validHeight = true;
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if (wallHeight <= 0) {
                    throw new Exception("Invalid height.");
                }
            }
            catch (InputMismatchException excpt) {  //TODO: This throws an infinite loop for String literal needs fixed.
                System.out.println(excpt.getMessage());
                validHeight = false;
            }
            catch (Exception excpt) {
                System.out.println(excpt.getMessage());
                validHeight = false;
            }
        } while (!validHeight);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        // Implement a do-while loop to ensure input is valid and any exceptions are handled

        do {
            validWidth = true;
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();      //first error, replaced duplicate wallHeight assignment
                                                    //with wallWidth

                if (wallWidth <= 0) {
                    throw new Exception("Invalid width.");
                }
            }
            catch (InputMismatchException excpt) {  //TODO: This throws an infinite loop for String literal needs fixed.
                System.out.println(excpt.getMessage());
                validWidth = false;
            }
            catch (Exception excpt) {
                System.out.println(excpt.getMessage());
                validWidth = false;
            }
        } while (!validWidth);

       // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");      //second error, wallArea variable
                                                                            //was not included in print statement

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");     //third error, incorrect identifier
                                                                                    //gallonspaintneeded replaced with
                                                                                    //gallonsPaintNeeded

    }
}
