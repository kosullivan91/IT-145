//Import Scanner class to collect user input
import java.util.Scanner;

public class LabProgram {
   
   /*this method determines and returns the total cost to drive based on the arguments 
   * provided- miles driven, miles per gallon, and price per gallon */
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
        double dollarCost = (drivenMiles / milesPerGallon) * dollarsPerGallon;
        
        return dollarCost;
        
    }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      //Get miles per gallon from user input
        double milesPerGallon = scnr.nextDouble();
        //Get price per gallon (in dollars) from user input
        double dollarsPerGallon = scnr.nextDouble();
        
        /*Output uses String formatting, converting the result to
        * a float with two-place decimial precision.  This is the best
        * representation of currency in Java known so far in this course */
        System.out.printf("%.2f", drivingCost(10, milesPerGallon, dollarsPerGallon));
        System.out.print(" ");
        System.out.printf("%.2f", drivingCost(50, milesPerGallon, dollarsPerGallon));
        System.out.print(" ");
        System.out.printf("%.2f", drivingCost(400, milesPerGallon, dollarsPerGallon));
        System.out.println("");
        
        /* Good practice is to close the Scanner object once its useful purpose is over.
        * To save resources, it is best to close the Scanner object in lieu of waiting 
        for the OS to shut is down automatically.
        https://stackoverflow.com/questions/43060776/why-is-scanner-close-useful-in-java/43060995*/
        scnr.close();
   
   }
}