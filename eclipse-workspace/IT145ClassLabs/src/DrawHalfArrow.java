//Import Scanner class to collect user input
import java.util.Scanner; 

public class DrawHalfArrow {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        //Program variables
        int arrowBaseHeight = 0;
        int arrowBaseWidth = 0;
        int arrowHeadWidth = 0;
        
        /*Collect user input for arrow base height, arrow base
        * width, and arrow head width.  (Arrow head must be
        * wider than arrow base).  Use the scanner object to collect
        * user input and store as int in the associated variables*/
        System.out.println("Enter arrow base height: ");
        arrowBaseHeight = scnr.nextInt();
        
        System.out.println("Enter arrow base width: ");
        arrowBaseWidth = scnr.nextInt();
        
        System.out.println("Enter arrow head width: ");
        arrowHeadWidth = scnr.nextInt();
        
        /*If the arrow head width input is less than the arrow
        * base width input, the while loop is entered and will continue
        * to prompt the user for arrow head width input until it is 
        * greater than the arrow base width.  A while loop is used here
        * because the number of iterations is unknown ahead of time as it
        * depends on user input and is not a set interval or pre-determined
        * count iteration that would be better served by a for loop*/
        while (arrowHeadWidth <= arrowBaseWidth) {
            System.out.println("Enter arrow head width: ");
            arrowHeadWidth = scnr.nextInt();
        }
        
        /*This nested for loop draws the base of the arrow.
        * For each character space or 'row' stacking up to the 
        * base's height, another for loop is run that iterates over
        * the number of character spaces or 'columns' comprising
        * the base width and prints the '*' character for each 
        * character space extending th length of the arrow base width.*/
        for (int i = 0; i < arrowBaseHeight; ++i) {
            for (int j = 0; j < arrowBaseWidth; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        /*This nested for loop draws the arrow head.  Each iteration
        * sets 'i' to the width of the arrow head, starting at the base
        * and decrementing to 0 to output the half arrow head shape.
        * The nested for loop sets 'j' equal to the width of the arrow
        * head at each given iteration and prints the '*' character 
        * for the length of the arrow head width at that iteration*/
        for (int i = arrowHeadWidth; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        /*Close the scanner object to conserve resources
        * and avoid OS kernel force shutdown.
        * https://stackoverflow.com/questions/43060776/why-is-scanner-close-useful-in-java/43060995*/
        scnr.close();
        
        return;
    
    }
}