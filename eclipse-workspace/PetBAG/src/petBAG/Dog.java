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
    }
    
}
