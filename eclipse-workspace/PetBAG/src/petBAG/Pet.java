package petBAG;

import java.util.Scanner;

public class Pet {

    /* Field declaration.  Fields are initialized in the class constructor.
     * Fields are private, as denoted by the '-' in the UML class diagram.
     * Numeric fields such as petAge, dogSpace, catSpace, etc. are
     * declared as int data types, not float or double (with the exception of
     * the amountDue field).  Best practice is to use int in lieu
     * of float or double when the value is countable and not measured.
     */
    
    private String petType;
    private String petName;
    private int petAge;
    
    /* The PetBAG spec calls for the ability to modify the dogSpace and catSpace
     * fields as needed, as these represent vacant space availability
     * for each respective pet type.  
     * The planned implementation of the checkIn() method 
     * decrements these fields when a pet is checked in to account for the 
     * reduction in vacancy.    
     * These fields should theoretically be common to all objects and not be 
     * instance specific in order to globally track vacant space availability. 
     * In practice, this would be accomplished using the static modifier 
     * to make them each class variables.  Class variables are associated with 
     * the class and each instance of the class shares the class variable.
     * Any object can change the value of a class variable 
     * (https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).   
     * This is not best practice, as its contrary to the object oriented paradigm. 
     * Per discussion on Stack Overflow, it violates the principle that data be 
     * encapsulated in objects.  Statics in Java are analogous to global variables
     * in non OOP languages and avoid scope boundaries 
     * (https://stackoverflow.com/questions/7026507/why-are-static-variables-considered-evil).
     * dogSpace and catSpace values will be influenced by the parameterized 
     * constructor (discussed below).
     */
    
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue; // double is the best representation of currency learned so far
    
    /* Class constructors.
    * If any constructor is defined, the compiler does not implicitly define a 
    * default constructor (i.e. no parameters).  Per zyBooks, best practice is to explicitly
    * define a default constructor and rely on method overloading for other constructors
    * so that an object creation statement like Pet pet = new Pet() without arguments remains
    * supported.  The compiler will throw an error if the default constructor is not defined
    * and a call is made to it.
    * With the planned implementation for the checkIn() method, 
    * petType input determines the object type to be instantiated (i.e. Cat or Dog).  
    * Passing petType into a parameterized constructor saves having to call 
    * setPetType separately.  The checkIn() method also requires the user to 
    * determine whether the client is a new or returning customer.  
    * Passing petName into a parameterized constructor could aid in
    * any future enhancement record search that might entail cross-referencing
    * petName against database records instantly, while also saving
    * the need to call setPetName separately.
    * In order to instantiate an object with the appropriate dogSpace and catSpace
    * values, these fields should be leveraged in a parameterized 
    * constructor so the appropriate value is set, as it is key
    * input in determining whether vacant space is available.
    * Because derived classes (i.e. Cat and Dog) can make use of the base
    * class constructors in their own constructor methods by using the 
    * super keyword, the parameterized Pet class constructor utilizes 
    * dogSpace and catSpace parameters that can be passed in as 
    * arguments at each derived class object instantiation to accurately reflect
    * available vacant space that will be used to determine whether there
    * is vacancy and the pet can be checked in.
    */
    
    // Default constructor- no parameters.
    public Pet() {
        
        petType = "None";
        petName = "None";
        
        /* Per zyBooks, fields of type int and double are typically initialized 
         * to a default value of -1/-1.0 when the constructor method signature 
         * does not include a parameter for that field.  
         * The petAge, dogSpace, catSpace, daysStay, and amountDue 
         * fields are initialized to -1 for their respective
         * data types.   
         */
        
        petAge = -1;
        dogSpace = -1;
        catSpace = -1;
        daysStay = -1;
        amountDue = -1.0;
    }
    
    // Parameterized constructor
    public Pet(String petType, String petName, int dogSpace, int catSpace) {
        
        this.petType = petType; // 'this' keyword clarifies ambiguity.
        this.petName = petName; // The object value is set to the argument
                                // passed in.
        
        /* Just as above, fields of type int and double are initialized to a
         * default value of -1/-1.0 when the constructor method signature 
         * does not include a parameter for that field.   
         */
        
        petAge = -1;
        
        /* When a Pet is checked in under the planned implementation of
         * the checkIn() method, the fields or variables representing cat
         * and dog space vacancy are decremented to record the vacancy reduction.  
         * Subsequent instantiations should know these current values
         * to reflect updates from prior calls to checkIn().  
         * These values should therefore be passed into a parameterized 
         * constructor at object instantiation.  The dogSpace and
         * catSpace fields should be initialized to the values passed in
         * representing dog and cat space vacancy.
         */
        
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        daysStay = -1;
        amountDue = -1.0;
    }
    
    /* Setters and Getters
     * Setter methods establish an interface to write class fields.
     * Getter methods establish an interface to read class fields.
     * The concept of encapsulation is implemented by way of making read and
     * write access to private fields available to other classes through
     * public setter and getter methods.  This controls how outside
     * classes can manipulate the object and hides the underlying
     * code/implementation details of those reads and writes 
     * from the class user.  
     */
    
    /* Setters. Void return type because they don't return a value.
     * The methods still have a return statement.
     * Per zyBooks, best practice is to always include a
     * return statement, even when the return type is void.
     * This is done in order to clear the stack frame 
     * (i.e. local variables created for the method).
     */
    
    public void setPetType(String petType) {
        this.petType = petType; // 'this' keyword clarifies ambiguity.
        return;                 //  The object value is set to the argument
                                //  passed in.
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
     * Getter methods take no arguments when called and 
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
    
    // Other methods.  Their definition is out of scope for the assignment.
    public void checkIn() {
        // TODO: N/A. Out of Assignment Scope.
    }
    
    public void checkOut() {
        // TODO: N/A. Out of Assignment Scope.
    }
    
    public void getPet() {
        // TODO: N/A. Out of Assignment Scope.
    }
    
    public void createPet() {
        // TODO: N/A. Out of Assignment Scope.
    }
    
    public void updatePet() {
        // TODO: N/A. Out of Assignment Scope.
    }
}
