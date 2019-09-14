/* Jeff Perkinson
 * IT-145 T1605 SNHU
 * September 2019
 */

package petBAG;

public class Dog {

    /* Field declaration.  Fields are initialized in the class constructor,
     * Fields specific to the Pet class will be migrated over in the next project.
     * These fields are private, denoted by the '-' in the UML class diagram.
     * Fields specific to the Dog class are public, 
     * as denoted by the '+' in the UML class diagram.
     * Numeric fields such as petAge, dogSpace, catSpace, etc. are
     * declared as int data types, not float or double (with the exception of
     * the amountDue field).  Best practice is to use int in lieu
     * of float or double when the value is countable and not measured.
     */
    
    private String petType;
    private String petName;
    private int petAge; 
    
    /* The PetBAG spec calls for the ability to modify the dogSpace and catSpace
     * fields as needed, as these represent vacant space availability.  
     * The planned implementation of the checkIn() method 
     * decrements these fields when a pet is checked in to account for the 
     * reduction in vacancy.    
     * These fields should theoretically be common to all objects and not be instance specific
     * to globally track vacant space availability. 
     * In practice, this would be accomplished with the static modifier 
     * to make them class variables.  Class variables are associated with the class.
     * Each instance of the class shares the class variable.
     * Any object can change the value of a class variable 
     * (https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).   
     * This is not best practice, as its contrary to the object oriented paradigm. 
     * Per discussion on Stack Overflow, it violates the principle that data is 
     * encapsulated in objects.  Statics in Java are analogous to global variables
     * in non OOP languages and avoid scope boundaries 
     * (https://stackoverflow.com/questions/7026507/why-are-static-variables-considered-evil).
     */
    
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue; // double is the best representation of currency learned so far
    public int dogSpaceNbr;
    public int dogWeight;
    public boolean grooming; // true/false is best representation of whether grooming is needed
    
   /* Class constructors.
    * With the planned implementation for the checkIn() method to be defined later, 
    * petType input determines the object type to be instantiated (i.e. Cat or Dog).  
    * Passing petType into the constructor saves having to call setPetType separately.
    * The checkIn() method requires the user to determine whether
    * the client is a new or returning customer.  Passing petName 
    * into the instantiation call saves having to call setPetName
    * separately and can also aid in any future enhancement record search 
    * that might entail cross-referencing petName against database records instantly.
    * Additionally, to keep dogSpace correctly updated at object instantiation,
    * this field should be leveraged in a parameterized constructor so the 
    * appropriate value is set as it is key input in determining
    * whether vacant space is available.
    * If any constructor is defined, the compiler does not implicitly define a 
    * default constructor (i.e. no parameters).  Per zyBooks, best practice is to explicitly
    * define a default constructor and rely on method overloading for other constructors
    * so that an object creation statement like Dog dog = new Dog() without arguments remains
    * supported.  The compiler will throw an error if the default constructor is not defined
    * and a call is made to it.
    */ 
    
    public Dog() { 
    
        // petType is not set to dog because it will be migrated to the Pet class later.
        petType = "None";
        petName = "None";
        
        /* Per zyBooks, fields of type int and double are typically initialized 
         * to a default value of -1/-1.0 when the constructor method signature 
         * does not include a parameter for that field.  
         * The petAge, dogSpace, catSpace, daysStay, amountDue, dogSpaceNbr, 
         * and dogWeight fields are initialized to -1 for their respective
         * data types.   
         */
        
        petAge = -1;
        dogSpace = -1;
        catSpace = -1;
        daysStay = -1;
        amountDue = -1.0;
        dogSpaceNbr = -1;
        dogWeight = -1;
        
        /* Fields of type boolean are typically initialized to a default value of false
         * when the constructor method signature does not include a parameter for
         * that field. 
         */
        
        grooming = false;
        
    }
    
    public Dog(String petType, String petName, int dogSpace) { 
        
        this.petType = petType; // 'this' keyword clarifies ambiguity.
        this.petName = petName; // The object value is set to the argument
                                // passed in.
        
        /* Just as in the default constructor, the petAge, daysStay, 
         * amountDue, dogSpaceNbr, and dogWeight fields are initialized 
         * to -1 for their respective data types.   
         */
        
        petAge = -1;
       
        /* When a Pet is checked in under the planned implementation of
         * the checkIn() method, the fields or variables representing cat
         * and dog space vacancy are decremented to record the vacancy reduction.  
         * Subsequent instantiations should know these current values
         * to reflect updates from prior calls to checkIn().  
         * These values should therefore be passed into a parameterized 
         * constructor at object instantiation.  For the Dog class, the 
         * dogSpace field should be initialized to the value passed in
         * representing dog space vacancy.  catSpace is initialized to -1
         * as it does not apply to the Dog class.
         */
        
        this.dogSpace = dogSpace;
        catSpace = -1;
        daysStay = -1;
        amountDue = -1.0;
        dogSpaceNbr = -1;
        dogWeight = -1;

        /* Just as in the default constructor, grooming is type boolean
         * and is initialized to a default value of false. 
         */
        
        grooming = false;
        
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
    
    public void setDogSpaceNbr(int dogSpaceNbr) {
        this.dogSpaceNbr = dogSpaceNbr;
        return;
    }
    
    public void setDogWeight(int dogWeight) {
        this.dogWeight = dogWeight;
        return;
    }
    
    public void setGroomming(boolean grooming) {
        this.grooming = grooming;
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
    
    public int getDogSpaceNbr() {
        return dogSpaceNbr;
    }
    
    public int getDogWeight() {
        return dogWeight;
    }
    
    public boolean getGrooming() {
        return grooming;
    }
    
    // Other methods.  These methods are currently out of scope.

    public void checkIn() {
        //TODO: N/A. Out of Assignment Scope
    }
    
    public void checkOut() {
        //TODO: N/A. Out of Assignment Scope
    }
    
    public void getPet() {
        //TODO: N/A. Out of Assignment Scope
    }
    
    public void createPet() {
        //TODO: N/A. Out of Assignment Scope
    }
    
    public void updatePet() {
        //TODO: N/A. Out of Assignment Scope
    }
}
