package petBAG;

public class Dog {

    /* Field declaration.  Fields are initialized in the class constructor,
     * with the exception of dogSpace and catSpace (explained below).
     * Fields specific to the Pet class per the UML class diagram
     * will be migrated over in the next project and are private, 
     * as denoted by the '-' in the UML class diagram.
     * Fields specific to the Dog class in the UML class diagram are public, 
     * as denoted by the '+' in the UML class diagram.
     */
    
    private String petType;
    private String petName;
    private int petAge; // use an int not float/double; age is countable not measured.
    
    /* dogSpace and catSpace are initialized to 30 and 12, respectively.
     * The PetBAG spec calls for the ability to modify these fields as needed.  
     * The planned implementation of the checkIn() method decrements these
     * fields when a pet is checked in.    
     * These fields should be common to all objects and not be instance specific. 
     * This is accomplished with the static modifier to make class variables.
     * Class variables are associated with the class.
     * Each instance of the class shares the class variable.
     * Any object can change the value of a class variable.
     * https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html   
     */
    
    private static int dogSpace = 30;
    private static int catSpace = 12;
    private int daysStay;
    private double amountDue; // double is best representation of currency learned so far
    public int dogSpaceNbr;
    public int dogWeight;
    public boolean grooming; // true/false is best representation whether grooming is needed
    
   /* Class constructors.
    * With the checkIn() method defined later, petType input determines the 
    * object type to be instantiated (i.e. Cat or Dog).  
    * Passing petType into the constructor saves having to call setPetType separately.
    * The checkIn() method requires the user to determine whether
    * the client is a new or returning customer.  Passing petName 
    * into the instantiation call saves having to call setPetName
    * separately and can also aid in any future enhancement record search 
    * that might entail cross-referencing petNaem against database records instantaneously.
    * If any constructor is defined, the compiler does not implicitly define a 
    * default constructor (i.e. no parameters).  Best practice is to explicitly
    * define a default constructor and rely on method overloading for other constructors
    * so that an object creation like Dog dog = new Dog() without arguments remains
    * supported.  The compiler will throw an error if the default constructor is not defined
    * and a call is made to it.
    */ 
    
    public Dog() { 
    
        // petType is not set to dog because it will be migrated to the Pet class later.
        petType = "None";
        petName = "None";
        
        /* Fields of type int and double are initialized to a default value of -1/-1.0 
         * when the constructor method signature does not include a parameter for
         * that field.  Therefore, the petAge, daysStay, amountDue, dogSpaceNbr, 
         * and dogWeight fields are initialized to -1 for their respective
         * data types.   
         */
        
        petAge = -1;
        
        /* When a Pet is checked in under the checkIn() method, the dogSpace
         * and catSpace fields are decremented to record the space reduction.  
         * Subsequent instantiations should look to the class variable dogSpace and catSpace
         * values to reflect any updates to space availability from prior
         * calls to checkIn() and these fields can therefore not be 
         * hard-coded values set by the constructor at each object instantiation.
         * That these value changes will be modified by each object checkIn()
         * is inconsequential because prior to decrementing, the value will be assigned to
         * the Cat or Dog object's catSpaceNbr and dogSpaceNbr, respectively. 
         * 
         * dogSpace and catSpace initialization statements are not included because 
         * they are static fields.  Each object's dogSpace and catSpace field values 
         * will be initialized to the class variable values at instantiation.
         * Per stackoverflow, "when you declare something as static, you are saying that it is a member 
         * of the class, not the object (hence why there is only one). Therefore it doesn't make sense 
         * to access it on the object, because that particular data member is associated with the class.
         * https://stackoverflow.com/questions/5642834/why-should-the-static-field-be-accessed-in-a-static-way
         */
        
        // this.dogSpace = dogSpace; Commented out, shown for posterity.
        // this.catSpace = catSpace; Commented out, shown for posterity. 
        daysStay = -1;
        amountDue = -1.0;
        dogSpaceNbr = -1;
        dogWeight = -1;
        
        /* Fields of type boolean are initialized to a default value of false
         * when the constructor method signature does not include a parameter for
         * that field. 
         */
        
        grooming = false;
    }
    
    public Dog(String petType, String petName) { 
        this.petType = petType;
        this.petName = petName;
        /* Fields of type int and double are initialized to a default value of -1/-1.0 
         * when the constructor method signature does not include a parameter for
         * that field.  Therefore, the petAge, daysStay, amountDue, dogSpaceNbr, 
         * and dogWeight fields are initialized to -1 for their respective
         * data types.   
         */
        petAge = -1;
       /* When a Pet is checked in under the checkIn() method, the dogSpace
        * and catSpace fields are decremented to record the space reduction.  
        * Subsequent instantiations should look to the global dogSpace and catSpace
        * values to reflect any updates to space availability from prior
        * calls to checkIn() and can therefore not be a hard-coded value.
        */
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        daysStay = -1;
        amountDue = -1.0;
        dogSpaceNbr = -1;
        dogWeight = -1;
        /* Fields of type boolean are initialized to a default value of false
         * when the constructor method signature does not include a parameter for
         * that field. 
         */
        grooming = false;
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
