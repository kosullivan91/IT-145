package petBAG;

import java.util.Scanner;

public class Pet {

    /* Field declaration.  Fields are initialized in the class constructor.
     * Fields are private, as denoted by the '-' in the UML class diagram.
     */
    
    private String petType;
    private String petName;
    private int petAge;
    /* The the checkIn() method decrements the dogSpace and catSpace
     * fields when a pet is checked in.  Due to scope constraints, these
     * field values must be defined outside any class method so they 
     * are accessible throughout the program.  They should not be set as a 
     * predefined value.  We want to have these fields common to all objects. 
     * This is accomplished with the static modifier to make these class variables.
     * are associated with the class- each instance of the class shares the class variable.
     * Any object can change the value of a class variable.
     * https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
     */
    private static int dogSpace = 30;
    private static int catSpace = 12;
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
        * Subsequent instantiations should look to the class variable dogSpace and catSpace
        * values to reflect any updates to space availability from prior
        * calls to checkIn() and can therefore not be a hard-coded value.
        * That these value changes will be modified by each object checkIn()
        * is inconsequential because prior to decrementing the value will be assigned to
        * the Cat or Dog object's catSpaceNbr and dogSpaceNbr, respectively. 
        */ 
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        daysStay = -1;
        amountDue = -1.0;
    }
    
    // Constructor with petType and petName parameters
//    public Pet(String petType, String petName) {
//        
//    }
    
    /* Setters and Getters
     * Setter methods establish an interface to write class fields.
     * The concept of encapsulation is implemented by way of making read and
     * write access to private fields available to other classes through
     * public setter and getter methods.  Setters provide write functionality to update 
     * the field. Getters provide read access and provide visibility into the field value.
     */
    
    /* Setters. Void return type because they don't return a value.
     * The methods still have a return statement even though return type is void
     * in order to clear the stack frame (i.e. local variables created for the method).
     */
    
    public void setPetType(String petType) {
        this.petType = petType;
        return;
    }
    
    public void setPetName(String petName) {
        this.petName = petName;
        return;
    }
    
    public void setPetAge(int petAge) {
        this.petAge = petAge;
        return;
    }
    
    public void setDogSpace(int dogSpace) {
        this.dogSpace = dogSpace;
        return;
    }
    
    public void setCatSpace(int catSpace) {
        this.catSpace = catSpace;
        return;
    }
    
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
        return;
    }
    
    public void setAmountDue (double amountDue) {
        this.amountDue = amountDue;
        return;
    }
    
    /* Getters. Return type is the data type of the field being returned.
     * Getter methods take no arguments when called and therefore
     * do not need to be defined with any parameters in the method signature.
     */
    
    public String getPetType() {
        return petType;
    }
    
    public String getPetName() {
        return petName;
    }
    
    public int getPetAge() {
        return petAge;
    }
    
    public int getDogSpace() {
        return dogSpace;
    }
    
    public int getCatSpace() {
        return catSpace;
    }
    
    public int getDaysStay() {
        return daysStay;
    }
    
    public double getAmountDue() {
        return amountDue;
    }
}