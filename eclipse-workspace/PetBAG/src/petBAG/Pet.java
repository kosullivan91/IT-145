package petBAG;

import java.util.Scanner;

public class Pet {

    /* Field declaration.  Fields are initialized in the class constructor.
     * Fields are private, as denoted by the '-' in the UML class diagram.
     */
    
    private String petType;
    private String petName;
    private int petAge;
    /* dogSpace and catSpace are initialized to 30 and 12, respectively,
     * initially for this class.  The PetBAG spec calls for the ability to modify
     * these as needed.  Additionally, the checkIn() method decrements the dogSpace and catSpace
     * fields when a pet is checked in.  Due to scope constraints, these
     * field values must be defined outside any class method so they 
     * are accessible throughout the program.  They should not be set as a 
     * predefined value.  We want to have these fields common to all objects. 
     * This is accomplished with the static modifier to make these class variables.
     * Class variables are associated with the class- each instance of the class shares the class variable.
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
     * Passing petType into a parameterized constructor saves having to call setPetType separately.
     * The checkIn() method also calls for the user to determine whether
     * the client is a new or returning customer.  Passing petName 
     * into a parameterized constructor saves having to call setPetName
     * separately and can also aid in any type of future enhancement record search 
     * that might entail cross-referencing against database records.
     * The Dog and Cat classes will need to include a parameterized constructor
     * that calls the base class's parameterized constructor.  This parameterized constructor
     * should be called for each respective Dog and Cat object instantiated during checkIn().
     * If any constructor is defined, the compiler does not implicitly define a 
     * default constructor (i.e. no parameters).  Best practice is to explicitly
     * define a default constructor and rely on method overloading for parameterized constructors
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
         * 
         * dogSpace and catSpace initialization statements are not included because they are static fields.
         * The object's dogSpace and catSpace field values will be initialized to the class variable values
         * at class instantiation.
         * Per stackoverflow, "when you declare something as static, you are saying that it is a member 
         * of the class, not the object (hence why there is only one). Therefore it doesn't make sense 
         * to access it on the object, because that particular data member is associated with the class.
         * https://stackoverflow.com/questions/5642834/why-should-the-static-field-be-accessed-in-a-static-way
         */
        // this.dogSpace = dogSpace; Commented out here, but shown for posterity.
        // this.catSpace = catSpace; Commented out here, but shown for posterity.
        daysStay = -1;
        amountDue = -1.0;
    }
    
    // Parameterized constructor with petType and petName parameters
    public Pet(String petType, String petName) {
        this.petType = petType;
        this.petName = petName;
        /* Just as above, fields of type int and double are initialized to a
         * default value of -1/-1.0 when the constructor method signature 
         * does not include a parameter for that field.   
         */
        petAge = -1;
        /* Just as with the default constructor, dogSpace and catSpace initialization 
         * statements are not included because they are static fields.
         * The object's dogSpace and catSpace field values will be initialized to the class variable values
         * at class instantiation.  See the default constructor for further discussion.
         */
        // this.dogSpace = dogSpace; Commented out here, but shown for posterity.
        // this.catSpace = catSpace; Commented out here, but shown for posterity.
        daysStay = -1;
        amountDue = -1.0;
    }
    
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
    
    // Other methods.  Only checkIn() is in scope for the assignment.
    public void checkIn() {
        //TODO: Write this method.
    }
    
    public void checkOut() {
        /* TODO: N/A. Out of Assignment Scope.
         * This method will check the pet out of petBAG.
         * It could involve calls to updatePet(), setAmountDue(),
         * getAmountDue(), getDaysStay(), etc. 
         */
    }
    
    public void getPet() {
        /* TODO: N/A. Out of Assignment Scope.
         * This method will retrieve the pet object
         * to read its properties.
         */
    }
    
    public void createPet() {
        /* TODO: N/A. Out of Assignment Scope.
         * This method will create a new object
         * and set its properties.
         */
    }
    
    public void updatePet() {
        /* TODO: N/A. Out of Assignment Scope.
         * This method will retrieve the pet object
         * to update (write) its properties.
         */
    }
    
    public boolean isSpaceAvailable(String petType) {
        if (petType.equals("dog")) {
            if (dogSpace > 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (catSpace > 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
