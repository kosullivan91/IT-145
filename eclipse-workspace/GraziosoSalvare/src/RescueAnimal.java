
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
    
    public void setName(String animalName) {
        name = animalName;
        return;
    }
    
    public void setType(String animalType) {
        type = animalType;
        return;
    }
    
    public void setGender(String animalGender) {
        gender = animalGender;
        return;
    }
    
    public void setAge(int animalAge) {
        age = animalAge;
        return;
    }
    
    public void setWeight(float animalWeight) {
        weight = animalWeight;
        return;
    }
    
    public void setAcquisitionDate(SimpleDateFormat animalAcquisitionDate) {
        acquisitionDate = animalAcquisitionDate;
        return;
    }
    
    public void setStatusDate(SimpleDateFormat animalStatusDate) {
        statusDate = animalStatusDate;
        return;
    }
    
    public void setAcquisitionSource(String animalAcquisitionSource) {
        acquisitionSource = animalAcquisitionSource;
        return;
    }
    
    public void setReserved(boolean isReserved) {
        reserved = isReserved;
        return;
    }
    
    public void setTrainingLocation(String animalTrainingLocation) {
        trainingLocation = animalTrainingLocation;
        return;
    }
    
    public void setTrainingStart(SimpleDateFormat animalTrainingStart) {
        trainingStart = animalTrainingStart;
        return;
    }
    
    public void setTrainingEnd(SimpleDateFormat animalTrainingEnd) {
        trainingEnd = animalTrainingEnd;
        return;
    }
    
    public void setTrainingStatus(String animalTrainingStatus) {
        trainingStatus = animalTrainingStatus;
        return;
    }
    
    public void setInServiceCountry(String serviceCountry) {
        inServiceCountry = serviceCountry;
        return;
    }
    
    public void setInServiceCity(String serviceCity) {
        inServiceCity = serviceCity;
        return;
    }
    
    public void setInServiceAgency(String serviceAgency) {
        inServiceAgency = serviceAgency;
        return;
    }
    
    public void setInServicePOC(String servicePOC) {
        inServicePOC = servicePOC;
        return;
    }
    
    public void setInServiceEmail(String serviceEmail) {
        inServiceEmail = serviceEmail;
        return;
    }
    
    public void setInServicePhone(String servicePhone) {
        inServicePhone = servicePhone;
        return;
    }
    
    public void setInServicePostalAddress(String servicePostalAddress) {
        inServicePostalAddress = servicePostalAddress;
        return;
    }
    
}
