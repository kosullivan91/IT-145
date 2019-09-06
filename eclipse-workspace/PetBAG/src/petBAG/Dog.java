package petBAG;

public class Dog {

    //Field Declaration.  Fields are not initialized
    
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue;
    public int dogSpaceNbr;
    public int dogWeight;
    public boolean grooming;
    
    /*Class constructor.
    * With the checkIn() method, petType determines the object type to be 
    * instantiated (e.g. Cat or Dog).  Passing petType into the constructor
    * saves having to call setPetType later.
    * The method checkIn() method also calls for the user to determine whether
    * the client is new or a returning customer.  Passing petName 
    * into the class instantiation saves having to call setPetName
    * later and also can aid in any type of future enhancement record search 
    * that might entail cross-referencing against datastore records*/ 
    
    public Dog(String petType, String petName) { 
        this.petType = petType;
        this.petName = petName;
        petAge = -1;
        /*When a Pet is checked in under checkIn(), the dogSpace
        * and catSpace fields are decremented to record space reduction.  
        * Subsequent instantiations should look to the field values
        * to reflect any updates to space availability from prior
        * calls to checkIn()*/
        this.dogSpace = dogSpace; 
        this.catSpace = catSpace;
        daysStay = -1;
        amountDue = -1.0;
        dogSpaceNbr = -1;
        dogWeight = -1;
        grooming = false;
    }
    
    /*Setters and Getters
     * Setter methods establish an interface to write class fields.
     * The concept of encapsulation is implemented by way of making read and
     * write access to private fields available to other classes through
     * public methods.  Setters provide write functionality to update the field.
     * Getters provide read access to provide visibility into the field value.*/
    
    //Setters.  Void return type because they don't return a value.
    
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
    
    //Getters.  Return type is the data type of the field being returned.
    
    
    
}
