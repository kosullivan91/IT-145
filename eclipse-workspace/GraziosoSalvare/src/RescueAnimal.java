
/* The SimpleDateFormat class is used to format dates according to
 * the format specified by the class user at object instantiation.
 * This class is imported here to facilitate date formatting
 * for the class fields representing date values.
 * http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
 */

import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Class variables
    
    /* Access modifiers are private to promote encapsulation.
     * Encapsulation restricts direct access to member fields,
     * only exposing read/write access through public methods
     * (getters and setters defined below).  This practice 
     * controls how outside classes manipulate the object 
     * and hides the underlying code/implementation details 
     * of those reads/writes from the class user.     
     */
    
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Default constructor
    
    public RescueAnimal() {
    
    }

    // Accessor Methods (getters)
    
    /* Getter methods establish an interface to read class fields.
     * Access modifiers are public to promote encapsulation.
     * Each method has a return type matching the type of the field
     * the method is accessing.
     */
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public String getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public SimpleDateFormat getAcquisitionDate() {
        return acquisitionDate;
    }
    
    public SimpleDateFormat getStatusDate() {
        return statusDate;
    }
    
    public String getAcquisitionSource() {
        return acquisitionSource;
    }
    
    public boolean getReserved() {
        return reserved;
    }
    
    public String getTrainingLocation() {
        return trainingLocation;
    }
    
    public SimpleDateFormat getTrainingStart() {
        return trainingStart;
    }
    
    public SimpleDateFormat getTrainingEnd() {
        return trainingEnd;
    }
    
    public String getTrainingStatus() {
        return trainingStatus;
    }
    
    public String getInServiceCountry() {
        return inServiceCountry;
    }
    
    public String getInServiceCity() {
        return inServiceCity;
    }
    
    public String getInServiceAgency() {
        return inServiceAgency;
    }
    
    public String getInServicePOC() {
        return inServicePOC;
    }
    
    public String getInServiceEmail() {
        return inServiceEmail;
    }
    
    public String getInServicePhone() {
        return inServicePhone;
    }
    
    public String getInServicePostalAddress() {
        return inServicePostalAddress;
    }
    
    // Mutator Methods (setters)

    /* Access modifiers are public to promote encapsulation.
     * Setter methods establish an interface to write class fields.
     * Methods have a void return type.  A return statement is
     * still provided even with the void return type in order to
     * clear the stack frame (i.e. local variable space created
     * for method execution)
     */
    
    
    
}
