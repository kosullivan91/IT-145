import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;   // Integer class needed for parsing and converting
                            // user input for int type variables

import static java.lang.Integer.parseInt;

public class Driver {

    // class variables (add more as needed)
    // ArrayLists for Ship, Cruise, and Passenger objects serve as application data store
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(String[] args) {

        // create a Scanner object to collect user input
        // this object will be passed in to other methods
        // that rely on standard user input collect as best
        // practice is to only create a single Scanner object
        // for each input stream (e.g. standard input System.in)

        Scanner scnr = new Scanner(System.in);

        initializeShipList(shipList);           // initial ships
        initializeCruiseList(cruiseList);       // initial cruises
        initializePassengerList(passengerList); // initial passengers

        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed

        displayMenu();
        //System.out.println(systemMenu);
        // use method chaining to capture the
        // user input and convert it to upper case to render
        // menu selection case insensitive
        String userSelection = scnr.next().toUpperCase();
        scnr.nextLine();

        // loop until the user chooses to exit
        // a while loop is used because the number of iterations is unknown
        while (!userSelection.equalsIgnoreCase("X")) {
            // a switch statement is used due to the number of menu items
            // and is cleaner than if-else and can catch exceptions easier
            try {
                switch (userSelection) {
                    case "1":
                        addShip(scnr);
                        break;
                    case "2":
                        editShip();
                        break;
                    case "3":
                        addCruise(scnr); //TODO: Can get stuck entering this method with no available ships, need to check for available ships first
                        break;
                    case "4":
                        editCruise();
                        break;
                    case "5":
                        addPassenger(); //TODO: This method needs reviewed.
                        break;
                    case "6":
                        editPassenger();
                        break;
                    case "A":
                        printShipList("name");
                        break;
                    case "B":
                        printShipList("active");
                        break;
                    case "C":
                        printShipList("full");
                        break;
                    case "D":
                        printCruiseList("list");
                        break;
                    case "E":
                        printCruiseList("details");
                        break;
                    case "F":
                        printPassengerList();
                        break;
                    case "X":
                        break;
                    default:
                        throw new Exception("Invalid Entry. Please try again");
                }
            }
            catch (Exception excpt){
                System.out.println(excpt.getMessage());
            }

            displayMenu();
            userSelection = scnr.next().toUpperCase();
            scnr.nextLine();
        }

        System.out.println("Goodbye.  Thanks for choosing Luxury Ocean Cruise Outings!");
        System.out.println("We hope to see you again soon!");
        scnr.close();   // close the Scanner object to prevent memory leak

        return;     // return even when return type is void to clear the stack frame
    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList(ArrayList<Ship> shipList) {  // added missing ArrayList<Ship> parameter
        // arguments - shipName, balcony, oceanview, suite, interior, inService
        // add new ship objects to ArrayList<Ship> passed in as the argument in the method call
        shipList.add(new Ship("Candy Cane", 20, 40, 10, 60, true));
        shipList.add(new Ship("Peppermint Stick", 10, 20, 5, 40, true));
        shipList.add(new Ship("Bon Bon", 12, 18, 2, 24, true));
        shipList.add(new Ship("Candy Corn", 12, 18, 2, 24, false));
        shipList.add(new Ship("Beached Whale", 12, 18, 2, 24, true));

    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList(ArrayList<Cruise> cruiseList) { // added missing ArrayList<Cruise> parameter
        // arguments - cruiseName, shipName, departure, destination, return
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
        Cruise newCruise2 = new Cruise("Billy Belle", "Bon Bon", "Jacksonville", "Bermuda", "Jacksonville");
        cruiseList.add(newCruise2);
        Cruise newCruise3 = new Cruise("Hello Cruise", "Candy Cane", "New York", "Bermuda", "Jacksonville");
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
    public static void addShip(Scanner scnr) {
        // declare method variables
        // these will be used to store user input and pass
        // into the Ship constructor
        String shipName = "";   // initialized to allow compilation
        int roomBalcony;
        int roomOceanView;
        int roomSuite;
        int roomInterior;
        String inServiceInput;  // String variable to store user's response
                                // to whether ship is available for cruises
        boolean inService = false;  // initialized to allow compilation
        boolean validEntry;  // boolean variable to drive the validation loops

        // ensure the ship does not already exist in the system
        // Prompt user to input the Ship's name
        // Implement a do-while loop with exception handling to ensure input is valid
        // and any exceptions are handled

        do {
            validEntry = true;
            try {
                System.out.println("Enter ship name: ");
                // Store the user input as String in shipName variable
                // method assumes no constraints on shipName other
                // than uniqueness; only validation of uniqueness is implemented
                shipName = scnr.nextLine();

                // loop through the existing shipList array
                // if a ship with the same name exists throw an exception
                for (int i = 0; i < shipList.size(); ++i) {
                    // use method chaining to retrieve the Ship object
                    // in the shipList ArrayList for each iteration and
                    // compare shipName values to determine whether
                    // the user's entry is unique
                    if (shipName.equalsIgnoreCase(shipList.get(i).getShipName())) {
                        throw new Exception("Invalid entry. Ship name already exists. Ship name must be unique.");
                    }
                }
                // throw an exception if no name is provided
                if (shipName.isEmpty() || shipName.isBlank()) {
                    throw new Exception("Invalid entry. Please enter a ship name.");
                }
            }
            catch (Exception excpt) {
                System.out.println("Bad value exception. " + excpt.getMessage());
                validEntry = false;
            }
        } while (!validEntry);

        // ensure all class variables are populated
        // the roomInputValidation() method validates user entry as int
        // and returns the user input provided
        roomBalcony = roomInputValidation(scnr, "balcony");
        roomOceanView = roomInputValidation(scnr, "ocean view");
        roomSuite = roomInputValidation(scnr, "suite");
        roomInterior = roomInputValidation(scnr, "interior");

        // prompt the user whether ship is available for cruises (i.e. in service)
        do {
            validEntry = true;
            try {
                System.out.println("Is this ship currently available for cruises? (Y/N) ");
                inServiceInput = scnr.nextLine();
                // throw an exception if user does not enter 'Y' or 'N'
                if (!inServiceInput.equalsIgnoreCase("Y") && !inServiceInput.equalsIgnoreCase("N")) {
                    throw new Exception("Please enter Y or N.");
                }
                if (inServiceInput.equalsIgnoreCase("Y")) {
                    inService = true;
                }
                else {
                    inService = false;
                }
            }
            catch (Exception excpt) {
                System.out.println("Invalid Entry. " + excpt.getMessage());
                validEntry = false;
            }
        } while (!validEntry);

        // add ship to the system
        // adds a new ship object, includes all class variables, updates appropriate ArrayList
        // via the add() method defined above
        add(shipName, roomBalcony, roomOceanView, roomSuite, roomInterior, inService);

        return;     // clear the stack frame
    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise(Scanner scnr) {
        // declare method variables
        // these will be used to store user input and pass
        // into the Cruise constructor
        // all string variables are initialized to allow compilation
        String cruiseName = "";
        String cruiseShipName = "";
        String departurePort = "";
        String destination = "";
        String returnPort = "";
        boolean validEntry;         // boolean variable to drive the validation loops
        int validShipCount;         // valid ship name counter; if greater than 0 there's a match
                                    // will not exceed 1 since Ship names in shipList are unique
        boolean shipInService;      // boolean variable to drive validation loops
                                    // based on whether the ship is in service, available for cruises
        boolean shipHasCruise;      // boolean variable to drive validation loops
                                    // based on whether the ship provided is already assigned to a cruise

        // ensure the cruise does not already exist in the system
        // Prompt user to input the Cruise's name
        // Implement a do-while loop with exception handling to ensure input is valid
        // and any exceptions are handled
        do {
            validEntry = true;
            try {
                System.out.println("Enter cruise name: ");
                // Store the user input as String in cruiseName variable
                // method assumes no constraints on cruiseName other
                // than uniqueness; only validation of uniqueness is implemented
                cruiseName = scnr.nextLine();

                // loop through the existing cruiseList array
                // if a cruise with the same name exists throw an exception
                for (int i = 0; i < cruiseList.size(); ++i) {
                    // use method chaining to retrieve the Cruise object
                    // in the cruiseList ArrayList for each iteration and
                    // compare cruiseName values to determine whether
                    // the user's entry is unique
                    if (cruiseName.equalsIgnoreCase(cruiseList.get(i).getCruiseName())) {
                        throw new Exception("Invalid entry. Cruise name already exists. Cruise name must be unique.");
                    }
                }
                // throw an exception is no name is provided
                if (cruiseName.isEmpty() || cruiseName.isBlank()) {
                    throw new Exception("Invalid entry. Please enter a cruise name.");
                }
            }
            catch (Exception excpt) {
                System.out.println("Bad value exception. " + excpt.getMessage());
                validEntry = false;
            }
        } while (!validEntry);

        // ensure all class variables are populated
        // the stringInputValidation() method validates user entry to
        // ensure it is neither empty nor blank
        // and returns the user input provided
        departurePort = stringInputValidation(scnr, "departure port");
        destination = stringInputValidation(scnr, "cruise destination");
        returnPort = stringInputValidation(scnr, "return port");
        // validate the ship name to ensure it's part of the Ship list
        // and validate whether the ship is in service
        do {
            validEntry = true;
            try {
                validShipCount = 0;
                shipInService = false;
                shipHasCruise = false;
                cruiseShipName = stringInputValidation(scnr, "cruise ship name");
                for (int i = 0; i < shipList.size(); ++i) {
                    // use method chaining to retrieve the Ship object
                    // in the shipList ArrayList for each iteration and
                    // compare shipName values to determine whether
                    // the user's entry is a valid Ship name
                    if (cruiseShipName.equalsIgnoreCase(shipList.get(i).getShipName())) {
                        validShipCount ++;
                        // if a matching ship is found, determine whether it is in service
                        // if the ship is in service note it as such
                        if (shipList.get(i).getInService()) {
                            shipInService = true;
                        }
                        // if the ship is already assigned to a cruise
                        // throw an exception
                        shipHasCruise = hasCruise(cruiseShipName);
                    }
                }
                if (validShipCount == 0) {
                    throw new Exception ("Invalid ship name entry.  Please enter a valid ship name.");
                }
                if (!shipInService) {
                    throw new Exception("Invalid ship entry.  Ship is not in service.  Please enter a valid ship.");
                }
                if (shipHasCruise) {
                    throw new Exception("Invalid ship entry. Ship is already assigned to a cruise.  Please enter a valid ship.");
                }
            }
            catch (Exception excpt) {
                System.out.println("Bad value exception. " + excpt.getMessage());
                validEntry = false;
            }
        } while (!validEntry);

        // add the new cruise to the cruiseList ArrayList
        // adds a new Cruise object, includes all class variables, updates appropriate ArrayList
        Cruise newCruise = new Cruise(cruiseName, cruiseShipName, departurePort, destination, returnPort);
        cruiseList.add(newCruise);

        return;     // clear the stack frame
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

    // Room input validation
    // ensures user input is a number and returns the input
    public static int roomInputValidation(Scanner scnr, String roomType) {
        // method variables
        boolean validEntry;         // boolean variable to drive validation loop
        int roomCount = 0;          // int variable to store and return room count provided
                                    // initialized to 0 to ensure compilation
        String roomCountAsString;   // String variable to hold user input for parsing and converison

        do {
            validEntry = true;
            try {
                System.out.println("Enter number of " + roomType + " rooms.");
                // Store the user input as String variable for parsing and Integer type conversion
                roomCountAsString = scnr.nextLine();
                // If conversion does not occur an exception will
                // be thrown that is handled by the catch block
                // this approach ensures an entry is submitted as no entry
                // also throws an exception
                roomCount = Integer.parseInt(roomCountAsString);
                // ensure roomCount is not negative
                // 0 is allowed as a given Ship might not have
                // any rooms of the specified type
                if (roomCount < 0) {
                    throw new Exception("Room count can not be negative.  Enter 0 if no rooms.");
                }
            }

            catch (Exception excpt) {
                System.out.println("Bad value exception. " + excpt.getMessage());
                validEntry = false;
            }
        } while (!validEntry);

        return roomCount;
    }

    // String input validation
    // Ensures user input is not empty or null and returns the input
    public static String stringInputValidation(Scanner scnr, String fieldName) {
        // method variables
        boolean validEntry;             // boolean variable to drive validation loop
        String userInput = "";          // String variable to hold user input for validation
                                        // Variable is initialized to ensure compilation
        do {
            validEntry = true;
            try {
                System.out.println("Enter " + fieldName + ".");
                // Store the user input
                userInput = scnr.nextLine();
                // throw an exception if entry is empty or blank
                if (userInput.isEmpty() || userInput.isBlank()) {
                    throw new Exception("Invalid entry. Input can not be empty or blank.");
                }
            }

            catch (Exception excpt) {
                System.out.println("Bad value exception. " + excpt.getMessage());
                validEntry = false;
            }
        } while (!validEntry);

        return userInput;
    }

    // Method to determine whether a given ship name is
    // already assigned to a cruise.  Used for validation
    // in addCruise() method
    public static boolean hasCruise(String shipName) {
        boolean shipHasCruise = false;
        for (int i = 0; i < cruiseList.size(); ++i) {
            if (shipName.equalsIgnoreCase(cruiseList.get(i).getCruiseShipName())) {
                shipHasCruise = true;
            }
        }
        return shipHasCruise;
    }
}
