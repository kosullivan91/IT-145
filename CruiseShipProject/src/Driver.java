import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Driver {

    // class variables (add more as needed)
    // ArrayLists for Ship, Cruise, and Passenger objects serve as application data store
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(String[] args) {

        initializeShipList(shipList);           // initial ships
        initializeCruiseList(cruiseList);       // initial cruises
        initializePassengerList(passengerList); // initial passengers

        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed



        return;     // return even when return type is void to clear the stack frame
    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList(ArrayList<Ship> shipList) {  // added missing ArrayList<Ship> parameter
        // arguments - shipName, balcony, oceanview, suite, interior, inService
        // add new ship objects to ArrayList<Ship> passed in as the argument in the method call
        shipList.add(new Ship("Candy Cane", 20, 40, 10, 60, true));
        shipList.add(new Ship("Peppermint Stick", 10, 20, 5, 40, true));
        shipList.add(new Ship("Bon Bon", 12, 18, 2, 24, false));
        shipList.add(new Ship("Candy Corn", 12, 18, 2, 24, false));
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList(ArrayList<Cruise> cruiseList) { // added missing ArrayList<Cruise> parameter
        // arguments - cruiseName, shipName, departure, destination, return
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
        Cruise newCruise2 = new Cruise("Billy Belle", "Bon Bon", "Jacksonville", "Bermuda", "Jacksonville");
        cruiseList.add(newCruise2);
        Cruise newCruise3 = new Cruise("Hello Cruise", "Candy Corn", "New York", "Bermuda", "Jacksonville");
        cruiseList.add(newCruise3);
    }

    // hardcoded passenger data for testing
    // Initialize passenger list
    public static void initializePassengerList(ArrayList<Passenger> passengerList) {    // added missing ArrayList<Passenger> parameter
        // arguments - pName, pCruise, pRoomType
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            // Track active ships
            int activeShipCount = 0;    // initialize to 0, if there are
                                        // no active ships the method will
                                        // return as much.

            System.out.println("\n\nSHIP LIST - Active");
            // Loop through the ArrayList shipList
            // If the ship is in service (i.e. Ship.inService is true),
            // print the Ship name
            // A for loop is used because the number of iterations
            // are known at loop onset as determined by the size
            // of the ArrayList shipList

            for (int i = 0; i < shipList.size(); i++) {
                // method chaining is used here
                // shipList.get(i) returns that Ship object
                // stored at the given index
                // Ship.getInService() is chained onto the end
                // to return the boolean inService value for the
                // particular Ship.
                // inside the if block method chaining is used to
                // call the toString method to print the shipName
                if (shipList.get(i).getInService()) {
                    System.out.println(shipList.get(i).toString()); // Ship.toString() overrides the
                                                                    // parent Object class toString method
                                                                    // and returns shipName
                    activeShipCount++;  // increase active ship count by one for each active ship found
                }
            }

            // if there are no active ships, print an informative message citing no active ships
            if (activeShipCount < 1) {
                System.out.println("There are no active cruise ships at this time.");
            }

        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip() {

        // complete this method
        // ensure the ship does not already exist in the system

        // ensure all class variables are populated
        // use try-catch exception handling to validate user input

        // add ship to the system
        // adds a new ship object, includes all class variables, updates appropriate ArrayList

    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise() {

        // complete this method

        
    }

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {

        Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();

        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        String newCruiseName = newPassengerInput.nextLine();

        // ensure cruise exists
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                // cruise does exist
            } else {
                System.out.println("That cruise does not exist in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }

}
