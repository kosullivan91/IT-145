
public class Monkey extends RescueAnimal {

    // Class variables
    
    // TODO: why are these public? 
    
    public String species;  // Analogous to breed used for Dog
                            // Per the spec only specific species
                            // are eligible for training.
    
    /* Tail, height, body, torso, skull, and neck measurements
     * are declared as floats because they are measurable.
     * Best practice is to use float or double in lieu
     * of int for values that are measured and not counted.
     * Measurements should be entered in centimeters (cm)
     * to promote consistency among global locations.
     */
    
    public float tailLength;
    public float height;
    public float bodyLength;
    public float torsoSize;
    public float skullSize;
    public float neckSize;    
    
    // Constructor
    
    /* The constructor will initialize the 
     * member fields to their Java default values
     * as no custom statements are specified.
     * Floats will be initialized to 0.0 and
     * Strings will be initialized to null.
     * As monkey inherits the RescueAnimal class,
     * the RescueAnimal default constructor will be 
     * implicitly applied first, followed by default
     * initialization of the member fields specific 
     * to Monkey.
     */
    
    public Monkey() {
        
    }
    
    // Accessor methods
    
    
    // Mutator methods
    
}
