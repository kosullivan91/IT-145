
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
    
    /* Getter methods establish an interface to read class fields.
     * Each method has a return type matching the type of the field
     * the method is accessing.
     */
    
    public String getSpecies() {
        return species;
    }
    
    public float getTailLength() {
        return tailLength;
    }
    
    public float getHeight() {
        return height;
    }
    
    public float getBodyLength() {
        return bodyLength;
    }
    
    public float getTorsoSize() {
        return torsoSize;
    }
    
    public float getSkullSize() {
        return skullSize;
    }
    
    public float getNeckSize() {
        return neckSize;
    }
    
    // Mutator methods
    
    /* Setter methods establish an interface to write class fields.
     * Methods have a void return type.  A return statement is
     * still provided even with the void return type in order to
     * clear the stack frame (i.e. local variable space created
     * for method execution)
     * Method parameters are of type matching the type of the
     * field being modified through the method.
     * In many cases for naming simplicity, method parameters share 
     * the same identifier as the field being modified.  
     * Making use of the 'this' keyword clarifies ambiguity.  
     * The object's field value is set to the argument 
     * passed in to the method call.  However, the team has chosen
     * a different approach, as evidenced in the Dog class.
     * For consistency, the parameter identifier in the below
     * setter methods differs from the member field identifier
     * and the 'this' keyword is not utilized.
     */
    
    public void setSpecies(String animalSpecies) {
        species = animalSpecies;
        return;
    }
    
    public void setTailLength(float animalTailLength) {
        tailLength = animalTailLength;
        return;
    }
    
    public void setHeight(float animalHeight) {
        height = animalHeight;
        return;
    }
    
    public void setBodyLength(float animalBodyLength) {
        bodyLength = animalBodyLength;
        return;
    }
    
    public void setTorsoSize(float animalTorsoSize) {
        torsoSize = animalTorsoSize;
        return;
    }
    
    public void setSkullSize(float animalSkullSize) {
        skullSize = animalSkullSize;
        return;
    }
    
    public void setNeckSize(float animalNeckSize) {
        neckSize = animalNeckSize;
        return;
    }
    
}
