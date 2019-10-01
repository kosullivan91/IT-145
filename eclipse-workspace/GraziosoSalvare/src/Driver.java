// Import Java Scanner class to facilitate Scanner object
// creation to capture user input.
import java.util.Scanner;

// Import Java ArrayList class to facilitate ArrayList
// creation to house animal objects for iteration
import java.util.ArrayList;

public class Driver {

    /* Scanner object to capture user input.
     * The object is declared as static so it is
     * accessible as the user input object for 
     * all methods in the class.
     */
    
    static Scanner scnr = new Scanner(System.in);
    
    public static void main(String[] args) {

        // Class variables
        
        /* Application options menu.  This is stored in a single
         * variable that can be passed into each print command at
         * various application points to prevent code redundancy
         * and consolidate future option updates to a single
         * location in the code.  
         */
        
        String optionsMenu =    "Please select an option.\n"
                              + "R - Process request for new service animal\n"
                              + "U - Update existing animal records\n"
                              + "P - Print animals by training phase\n"
                              + "A - Add new animal\n"
                              + "T - Transfer animal/place in service\n"
                              + "E - Process end of service (retirement/death)\n"
                              + "Q - Quit application\n";
                
        /* Capture and store the user's selection from the option menu
         * Initialize it to an empty char so the application loop
         * is entered.
         */
        
        char userSelection = ' ';

        /* ArrayList animalStore is an ArrayList of RescueAnimal
         * objects to serve as the application's database of animals.
         */
        
        ArrayList<RescueAnimal> animalStore = new ArrayList<RescueAnimal>();
        
        // TODO: Create New Dog
        Dog rescueDog1 = new Dog();
        rescueDog1.setName("Fido");
        // TODO: Create New Monkey
        Monkey rescueMonkey1 = new Monkey();
        rescueMonkey1.setName("Jeeves");
        // TODO: Add new objects to ArrayList
        animalStore.add(rescueDog1);
        animalStore.add(rescueMonkey1);
               
        System.out.println("Welcome to Grazioso Salvare.");
        
        /* Application start.
         * Present user with option menu for functionality selection
         * and ensure valid input.
         */
        
        System.out.println(optionsMenu);

        /* Capture the user's input, convert it to upper case,
         * and grab only the first element to ensure 
         * method input consistency
         */
        
        userSelection = scnr.nextLine().toUpperCase().charAt(0);
        
        // continue running until users opts to quit
        
        while (userSelection != 'Q') {
                     
            /* Loop to ensure the user enters a valid selection.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop. 
             */
            
            //TODO: can we use an Enum here?
            while (userSelection != 'R' && userSelection != 'U' && userSelection != 'P' && userSelection != 'A' &&
                    userSelection != 'T' && userSelection != 'E' && userSelection != 'Q') {
                 System.out.println("Invalid selection");
                 System.out.println(optionsMenu);
                 userSelection = scnr.nextLine().toUpperCase().charAt(0);
             }
            
            /* Break out of the main loop if user opts to
             * quit from the validation loop.
             */
            
            if(userSelection == 'Q') {
                break;
            }
            
            /* Execute functionality selected.
             * This is nested in a while loop so as to continue to present
             * the option menu after each function execution
             * until user quits the application.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop.
             */
            
            if(userSelection == 'R') {
                System.out.println("FIXME: Process request for a rescue animal");
            }
            
            if(userSelection == 'U') {
                System.out.println("FIXME: Update information on existing animals");
            }
            
            if(userSelection == 'P') {
                System.out.println("FIXME: Print animals by training phase");
            }
            
            /* Add a new animal to the database (i.e. ArrayList animalStore).
             * User is prompted to enter the animal type and the respective
             * object type is created and added to animalStore.  
             * The addAnimal() method is then called and the newly created
             * animal object is passed as its argument.
             */
            
            if(userSelection == 'A') {
                String animalTypeMenu = "Please select the animal type.\n"
                                      + "1 - Dog\n"
                                      + "2 - Monkey";
                
                System.out.println(animalTypeMenu);
                int addSelection = scnr.nextInt();
                scnr.nextLine();
                
                // Loop to validate user input
                
                while(addSelection != 1 && addSelection != 2) {
                    System.out.println("Invalid selection.");
                    System.out.println(animalTypeMenu);
                    addSelection = scnr.nextInt();
                    scnr.nextLine();
                }
                
                if(addSelection == 1) {
                    Dog newAnimal = new Dog();
                    newAnimal.setType("dog");
                    // add the animal to the DB
                    animalStore.add(newAnimal);
                    // call method to add animal
                    addAnimal(newAnimal);
                }
                else {
                    Monkey newAnimal = new Monkey();
                    newAnimal.setType("monkey");
                 // add the animal to the DB
                    animalStore.add(newAnimal);
                    // call method to add animal
                    addAnimal(newAnimal);
                }
                
            }
            
            if(userSelection == 'T') {
                System.out.println("FIXME: Transfer animal/place in service");
            }
            
            if(userSelection == 'E') {
                System.out.println("FIXME: Process end of service (retirement/death)");
            }
            
            System.out.println(optionsMenu);
            //TODO: Hitting 'Enter' w/o an option selection crashes the program
            userSelection = scnr.nextLine().toUpperCase().charAt(0);
            
        }
        
        System.out.println("Goodbye.  Grazioso Salvare, Jeff Perkinson \u00A92019");

    }
    

   // Method to process request for a rescue animal



    // Method(s) to update information on existing animals



    // Method to display matrix of animals based on location and status/training phase



    /* Method to add animals.
     * By taking advantage of inheritance, the method can be defined
     * with a parameter of RescueAnimal, which in turn supports
     * calls to the method in main() supported for both Dog and
     * Monkey class arguments.  Regardless of the animal type to be added, the
     * same method can be called.  This prevents repetition of code
     * in the program.
     * The static modifier is used so the method can be called without the
     * need to create an object beforehand.  
     */

    public static void addAnimal(RescueAnimal animal) {
        
        /* Calls to class setters will allow the user to set certain
         * object fields.  Only the fields pertinent to new animal
         * intake will be available to set through this method.
         * Fields such as those pertaining to training or placing in 
         * service will be exposed through other methods, such as
         * updating existing records or transferring an animal into 
         * service.  Per the specification, when a new animal is taken
         * in, the breed, gender, age, weight, date, and location acquired
         * are recorded.  Additionally, dogs are given a status of 'intake'
         * before training starts.  The assumption is made the same will be done
         * for monkeys, so this function sets trainingStatus to 'intake'
         * and defaults the acquisition date to the current date. 
         */
        
        String addAnimalOptionsMenu =     "Please select an option.\n"
                                        + "B - Add breed/species\n"
                                        + "G - Add gender\n"
                                        + "A - Add age\n"
                                        + "W - Add weight\n"
                                        + "D - Modify acquisition date (curent date is default)\n"
                                        + "S - Add acquistion source\n"
                                        + "R - Return to main menu\n";
        
        // Char variable to hold user's choice to drive setter called
        char userSelection;
        
        /* Arrays representing eligible dog breeds and monkey species
         * per the specification.  These arrays will enforce appropriate
         * breed/species assignment when setting the breed/species 
         * value on a particular object.
         */
        
        String[] dogBreeds = {"American pit bull terrier", "Beagle", "Belgian malinois",
                              "Border collie", "Bloodhound", "Coonhound", "English springer spaniel",
                              "German shepherd", "German shorthaired pointer", "Golden retriever",
                              "Labrador retriever", "Nova Scotia duck tolling retriever",
                              "Rough collie", "Smooth collie"};
        
        String[] monkeySpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey",
                                  "Tamarin"};
        
        //set trainingStatus to 'intake'
        
        animal.setTrainingStatus("intake");
        
        //TODO: default the acquisition date to the current date.
        
        System.out.println("Add new " + animal.getType() + ".");
        System.out.println(addAnimalOptionsMenu);
        
        userSelection = scnr.nextLine().toUpperCase().charAt(0);
        
        // continue running until users opts to return to main
        
        while (userSelection != 'R') {
                     
            /* Loop to ensure the user enters a valid selection.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop. 
             */
            
            //TODO: can we use an Enum here?
            while (userSelection != 'B' && userSelection != 'G' && userSelection != 'A' && userSelection != 'W' &&
                    userSelection != 'D' && userSelection != 'S' && userSelection != 'R') {
                 System.out.println("Invalid selection");
                 System.out.println(addAnimalOptionsMenu);
                 userSelection = scnr.nextLine().toUpperCase().charAt(0);
             }
            
            /* Break out of the main loop if user opts to
             * quit from the validation loop.
             */
            
            if(userSelection == 'R') {
                break;
            }
        
            /* Execute functionality selected.
             * This is nested in a while loop so as to continue to present
             * the option menu after each function execution
             * until user returns to the main menu.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop.
             */
            
            if(userSelection == 'B') {

                // Capture animal object type to drive breed/species validation and input
                String animalType = animal.getType();
                
                // String variable to capture user's breed input for validation and setter argument
                String breedInput;
                
                // Boolean variable to determine whether input is valid
                boolean isValidBreed;
                
                if(animalType == "dog") {
                    System.out.println("Please enter a breed.");
                    breedInput = scnr.nextLine();
                    isValidBreed = isValidString(dogBreeds, breedInput);
                    System.out.println(isValidBreed);
                }
                else {
                    System.out.println("Please enter a species.");
                    breedInput = scnr.nextLine();
                    isValidBreed = isValidString(monkeySpecies, breedInput);
                    System.out.println(isValidBreed);
                }
            }
            
            if(userSelection == 'G') {
                System.out.println("FIXME: Call setter to add gender");
            }
            
            if(userSelection == 'A') {
                System.out.println("FIXME: Call setter to add age");
            }
            
            if(userSelection == 'W') {
                System.out.println("FIXME: Call setter to add weight");
            }
            
            if(userSelection == 'D') {
                System.out.println("FIXME: Call setter to add acquisition date");
            }
            
            if(userSelection == 'S') {
                System.out.println("FIXME: Call setter to add acquisition source");
            }
            
            System.out.println(addAnimalOptionsMenu);
            //TODO: Hitting 'Enter' w/o an option selection crashes the program
            userSelection = scnr.nextLine().toUpperCase().charAt(0);
            
        }     
    }
    
    // Method to validate is String input is a valid entry in a String array
    public static boolean isValidString(String[] stringArray, String inputString) {
        boolean isValid = false;
        for(int i = 0; i < stringArray.length; ++i) {
            if(inputString.toLowerCase().equals(stringArray[i].toLowerCase())) {
                isValid = true;
            }
        }
        return isValid;
    }

    // Method to out process animals for the farm or in-service placement



    // Method to display in-service animals



    // Process reports from in-service agencies reporting death/retirement




}
