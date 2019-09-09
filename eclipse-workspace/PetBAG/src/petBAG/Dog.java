package petBAG;

public class Dog {

    //Field Declaration.  Fields are initialized in the class constructor
    
    private String petType;
    private String petName;
    private int petAge;
    /* dogSpace and catSpace are initialized to 30 and 12, respectively,
     * initially for this class.  The PetBAG spec calls for the ability to modify
     * these as needed.  Additionally, the checkIn() method decrements these
     * fields when a pet is checked in.  Due to scope constraints, these
     * field values must be defined outside any class method so they 
     * are accessible throughout the program.  They also should not be set in the
     * constructor as each object initialization should set these fields
     * to the space available based on prior activities, not a pre-defined value.
     * When the parent portions of the Dog class are migrated to the Pet
     * class, these fields will become member fields for the main program class
     * housing the main() program method.   
     */
    private int dogSpace = 30;
    private int catSpace = 12;
    private int daysStay;
    private double amountDue;
    public int dogSpaceNbr;
    public int dogWeight;
    public boolean grooming;
    
    /*Class constructor.
    * With the checkIn() method, petType input determines the object type to be 
    * instantiated (i.e. Cat or Dog).  Passing petType into the constructor
    * saves having to call setPetType.
    * The checkIn() method also calls for the user to determine whether
    * the client is a new or returning customer.  Passing petName 
    * into the class instantiation saves having to call setPetName
    * later and can also aid in any type of future enhancement record search 
    * that might entail cross-referencing against datastore records.
    */ 
    public Dog(String petType, String petName) { 
        this.petType = petType;
        this.petName = petName;
         /*Fields of type int and double are initialized to a default value of -1/-1.0 
         * when the constructor method signature does not include a parameter for
         * that field.  Therefore, the petAge, daysStay, amountDue, dogSpaceNbr, 
         * and dogWeight fields are initialized to -1 for their respective
         * data types.   
         */
        petAge = -1;
        /*When a Pet is checked in under the checkIn() method, the dogSpace
        * and catSpace fields are decremented to record the space reduction.  
        * Subsequent instantiations should look to the global dogSpace and catSpace
        * values to reflect any updates to space availability from prior
        * calls to checkIn().
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
    
    /*Setters and Getters
     * Setter methods establish an interface to write class fields.
     * The concept of encapsulation is implemented by way of making read and
     * write access to private fields available to other classes through
     * public setter and getter methods.  Setters provide write functionality to update 
     * the field. Getters provide read access and provide visibility into the field value.
     */
    
    //Setters. Void return type because they don't return a value.
    
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
}
