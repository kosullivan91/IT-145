/* Jeff Perkinson
 * IT-145 T1605
 * October 2019
 */

//Import Java Scanner class to facilitate Scanner object
//creation to capture user input.
import java.util.Scanner;

//Import Java ArrayList class to facilitate ArrayList
//creation to house animal objects for iteration
import java.util.ArrayList;

/* The SimpleDateFormat class is used to format dates according to
 * the format specified by the class user at object instantiation.
 * This class is imported here to facilitate date formatting
 * for the class fields representing date values.
 * http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
 */

//Import Java Date class to support Date types needed for certain
//RescueAnimal fields.
import java.util.Date; 

public class Driver {
    
    public static void main(String[] args) {

        //Scanner object to capture user input
        
        Scanner scnr = new Scanner(System.in);
        
        // Class variables
        
        /* Application options menu.  This is stored in a single
         * variable that can be passed into each print command at
         * various application points to prevent code redundancy
         * and consolidate future option menu updates to a single
         * location in the code.  
         */
        
        String optionsMenu =    "Please select an option.\n"
                              + "R - Process request for new service animal\n"
                              + "U - Update existing animal records\n"
                              + "P - Print animals by training phase\n"
                              + "I - Intake new animal\n"
                              + "T - Transfer animal/place in service\n"
                              + "E - Process end of service (retirement/death)\n"
                              + "Q - Quit application\n";
                
        /* Declare a variable to capture and store
         * the user's selection from the option menu.
         */
        
        char userSelection;

        /* ArrayList animalStore is an ArrayList of RescueAnimal
         * objects to serve as the application's data store of animals.
         */
        
        ArrayList<RescueAnimal> animalStore = new ArrayList<RescueAnimal>();
        
        /*// TODO: Create New Dog
        Dog rescueDog1 = new Dog();
        rescueDog1.setName("Fido");
        // TODO: Create New Monkey
        Monkey rescueMonkey1 = new Monkey();
        rescueMonkey1.setName("Jeeves");
        // TODO: Add new objects to ArrayList
        animalStore.add(rescueDog1);
        animalStore.add(rescueMonkey1);
        */
               
        System.out.println("Welcome to Grazioso Salvare.");
        
        /* Application start.
         * Present user with option menu for functionality selection
         * and ensure valid input.
         */
        
        System.out.println(optionsMenu);

        /* Capture the user's input, convert it to upper case,
         * and grab only the first element to ensure 
         * method input consistency for branching decisions.
         */
        
        userSelection = scnr.nextLine().toUpperCase().charAt(0);
        System.out.println(userSelection);  // TEST OK
        
        // continue running until users opts to quit
        
        while (userSelection != 'Q') {
                     
            /* Loop to ensure the user enters a valid selection.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop. 
             */
            
            while (userSelection != 'R' && userSelection != 'U' && userSelection != 'P' && userSelection != 'I' &&
                    userSelection != 'T' && userSelection != 'E' && userSelection != 'Q') {
                 System.out.println("Invalid selection");
                 System.out.println(optionsMenu);
                 userSelection = scnr.nextLine().toUpperCase().charAt(0);
                 System.out.println(userSelection); //TEST OK
             }
            
            /* Break out of the main application loop if user opts to
             * quit from the validation loop.
             */
            
            System.out.println(userSelection);  //TEST OK
            
            if(userSelection == 'Q') {
                break; //TEST OK
            }
            
            /* Execute functionality selected.
             * This is nested in a while loop so as to continue to be
             * available each time the option menu is presented
             * after each function execution until the user quits the application.
             */
            
            if(userSelection == 'R') {
                System.out.println("FIXME: Process request for a rescue animal (Out of Assignment Scope)");
            }
            
            if(userSelection == 'U') {
                System.out.println("FIXME: Update information on existing animals (Out of Assignment Scope)");
            }
            
            if(userSelection == 'P') {
                System.out.println("FIXME: Print animals by training phase (Out of Assignment Scope)");
            }
            
            /* Add a new animal to the data store (i.e. ArrayList animalStore).
             * User is prompted to enter the animal type and the respective
             * object type is created and added to animalStore.  
             * The intakeAnimal() method is then called and the newly created
             * animal object is passed as its argument.
             */
            
            if(userSelection == 'I') {
                String animalTypeMenu = "Please select the animal type for intake.\n"
                                      + "1 - Dog\n"
                                      + "2 - Monkey";
                
                System.out.println(animalTypeMenu);
                
                /* nextInt() does not read the newline character
                 * (i.e. 'Enter' key ).
                 * To workaround this constraint, the input
                 * must be captured as a String and converted to an
                 * int using Integer.parseInt. 
                 * https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                 */
                 
                int intakeSelection = Integer.parseInt(scnr.nextLine());
                System.out.println("Selection: " + intakeSelection); // TEST OK
                //int intakeSelection = scnr.nextInt();
                //System.out.println(intakeSelection); //TEST OK
                
                // Loop to validate user input
                
                while(intakeSelection != 1 && intakeSelection != 2) {
                    System.out.println("Invalid selection.");
                    System.out.println(animalTypeMenu);
                    
                   /* Just as above, the input
                    * must be captured as a String and converted to an
                    * int using Integer.parseInt.
                    */
                    
                    intakeSelection = Integer.parseInt(scnr.nextLine());
                    System.out.println("Selection in Invalid Loop: " + intakeSelection); //TEST OK
                    // use nextLine() Scanner method to capture carriage return
                    // scnr.nextLine();
                }
                
                if(intakeSelection == 1) {
                    System.out.println("DOG SELECTED"); //TEST OK
                    Dog newAnimal = new Dog();
                    newAnimal.setType("dog");
                    // add the animal to the DB
                    animalStore.add(newAnimal);
                    System.out.println(animalStore); //TEST OK
                    // call method to add animal
                    System.out.println("Calling intakeAnimal for DOG"); //TEST OK
                    intakeAnimal(newAnimal);
                    
                }
                else {
                    System.out.println("MONKEY SELECTED"); //TEST OK
                    Monkey newAnimal = new Monkey();
                    newAnimal.setType("monkey");
                    // add the animal to the DB
                    animalStore.add(newAnimal);
                    System.out.println(animalStore); //TEST OK
                    // call method to add animal
                    System.out.println("Calling intakeAnimal for MONKEY"); //TEST OK
                    intakeAnimal(newAnimal);
                }
                
            }
            
            if(userSelection == 'T') {
                System.out.println("FIXME: Transfer animal/place in service (Out of Assignment Scope)");
            }
            
            if(userSelection == 'E') {
                System.out.println("FIXME: Process end of service (retirement/death) (Out of Assignment Scope)");
            }
            
            System.out.println(optionsMenu);
            userSelection = scnr.nextLine().toUpperCase().charAt(0);
            // Hitting 'Enter' without an option selection crashes the program
            // TODO: Loop to fix it
            System.out.println(userSelection); //TEST OK
            
        }
        
        System.out.println("Goodbye. Grazioso Salvare, Jeff Perkinson \u00A92019");
        
        scnr.close(); //close the Scanner object to conserve resources
        
        return; //return even when return type is void to clear the stack frame

    }
    

    // Method to process request for a rescue animal (Out of assignment scope)

    
    // Method(s) to update information on existing animals (Out of assignment scope)


    // Method to display matrix of animals based on location and status/training phase (Out of assignment scope)


    /* Method to intake animals.
     * By taking advantage of inheritance, the method can be defined
     * with a parameter of RescueAnimal, which in turn supports
     * calls to the method in main() passing both Dog and
     * Monkey class arguments, or any future animal class that
     * is derived from RescueAnimal.  
     * Regardless of the animal type to be added, the
     * same method can be called.  This prevents repetition of code
     * in the program.
     * The static modifier is used so the method can be called from main() 
     * without the need to create an object beforehand.  
     */

    public static void intakeAnimal(RescueAnimal animal) {
        
        //Scanner object to capture user input
        
        Scanner readInput = new Scanner(System.in);
        
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
        
        String intakeAnimalOptionsMenu =     "Please select an option.\n"
                                        + "B - Add breed/species\n"
                                        + "G - Add gender\n"
                                        + "A - Add age\n"
                                        + "W - Add weight\n"
                                        + "D - Modify acquisition date (curent date is default)\n"
                                        + "S - Add acquistion source\n"
                                        + "R - Return to main menu\n";
        
        // Char variable to hold user's choice to drive branching
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
        System.out.println(intakeAnimalOptionsMenu);
        
        /* Like in main(), capture the user's input, 
         * convert it to upper case,
         * and grab only the first element to ensure 
         * method input consistency for branching decisions.
         */
        
        userSelection = readInput.nextLine().toUpperCase().charAt(0);
        System.out.println("Initial userSeclection: " + userSelection); //TEST OK
        
        // continue running until users opts to return to main
        
        while (userSelection != 'R') {
            
            /* Loop to ensure the user enters a valid selection.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop. 
             */
            
            while (userSelection != 'B' && userSelection != 'G' && userSelection != 'A' && userSelection != 'W' &&
                    userSelection != 'D' && userSelection != 'S' && userSelection != 'R') {
                 System.out.println("Invalid selection");
                 System.out.println(intakeAnimalOptionsMenu);
                 userSelection = readInput.nextLine().toUpperCase().charAt(0);
                 System.out.println("Selection while in invalid loop: " + userSelection);
                 // scnr.nextLine();
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
                    breedInput = readInput.nextLine();
                    isValidBreed = isValidString(dogBreeds, breedInput);
                    System.out.println(isValidBreed);
                }
                else {
                    System.out.println("Please enter a species.");
                    breedInput = readInput.nextLine();
                    isValidBreed = isValidString(monkeySpecies, breedInput);
                    System.out.println(isValidBreed);
                }
            }
            
            if(userSelection == 'G') {
                String genderPrompt =     "Please enter animal gender\n"
                                        + "Male\n"
                                        + "Female";
                System.out.println(genderPrompt);
                String animalGender = readInput.nextLine().toLowerCase();
                
                System.out.println(animalGender);
                
                while(!animalGender.equals("male") && !animalGender.equals("female")) {
                    System.out.println("Invalid Selection.");
                    System.out.println(genderPrompt);
                }
                
                animal.setGender(animalGender);
                System.out.println("Animal gender has been set to " + animal.getGender());
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
            
            System.out.println(intakeAnimalOptionsMenu);
            //TODO: Hitting 'Enter' w/o an option selection crashes the program
            userSelection = readInput.nextLine().toUpperCase().charAt(0);
            
        }     
        
//        readInput.close(); //close the Scanner object to conserve resources  TODO: Closing this causes the bug
        
        return; //return even when return type is void to clear the stack frame
        
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

    // Method to out process animals for the farm or in-service placement (Out of assignment scope)


    // Method to display in-service animals (Out of assignment scope)


    // Process reports from in-service agencies reporting death/retirement (Out of assignment scope)

}
