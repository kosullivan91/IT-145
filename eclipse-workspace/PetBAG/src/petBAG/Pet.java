package petBAG;

import java.util.Scanner;

public class Pet {

    /* Field declaration.  Fields are initialized in the class constructor.
     * Fields are private, as denoted by the '-' in the UML class diagram.
     */
    
    private String petType;
    private String petName;
    private int petAge;
    //TODO: Address dogSpace/catSpace initialization and comment about it.
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue;
    
    /* Class constructors.
     * With the checkIn() method defined later, petType input determines the 
     * object type to be instantiated (i.e. Cat or Dog).  
     * Passing petType into the constructor saves having to call setPetType separately.
     * The checkIn() method also calls for the user to determine whether
     * the client is a new or returning customer.  Passing petName 
     * into the class constructor saves having to call setPetName
     * separately and can also aid in any type of future enhancement record search 
     * that might entail cross-referencing against database records.
     * If any constructor is defined, the compiler does not implicitly define a 
     * default constructor (i.e. no parameters).  Best practice is to explicitly
     * define a default constructor and rely on method overloading for other constructors
     * so that object creation like Pet pet = new Pet() without arguments remains
     * supported.  The compiler will throw an error if the default constructor is not defined
     * and an attempt to instantiate an object without arguments is made.
     */
    
    // Default constructor- no parameters.
    public Pet() {
        petType = "None";
        petName = "None";
        /* Fields of type int and double are initialized to a default value of -1/-1.0 
         * when the constructor method signature does not include a parameter for
         * that field.  Therefore, the petAge, daysStay, and amountDue
         * fields are initialized to -1 for their respective data types.   
         */
        petAge = -1;
       /* When a Pet is checked in under the checkIn() method, the dogSpace
        * and catSpace fields are decremented to record the space reduction.  
        * Subsequent instantiations should look to the global dogSpace and catSpace
        * values to reflect any updates to space availability from prior
        * calls to checkIn() and can therefore not be a hard-coded value.
        */
        // TODO: fix dogSpace and catSpace instantiation?
        dogSpace = dogSpace;
        catSpace = catSpace;
        daysStay = -1;
        amountDue = -1.0;
    }
    
    // Constructor with petType, petName, dogSpace, catSpace parameters
    public Pet(String petType, String petName, int dogSpace, int catSpace) {
        
    }
    
}
