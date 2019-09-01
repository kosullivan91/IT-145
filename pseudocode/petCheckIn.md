// ===== Pet.java =====
class Pet(parameters):
    DECLARE the private petType field as String
    DECLARE the private petName field as String
    DECLARE the private petAge field as int
    DECLARE the private dogSpace field as int
    DECLARE the private catSpace field as int
    DECLARE the private daysStay field as int
    DECLARE the private amountDue field as double

    // Default Constructor
    function Pet():
        SET petType field to "Unknown"
        SET petName field to "Unknown"
        SET petAge field to -1
        SET dogSpace field to -1
        SET catSpace field to -1
        SET daysStay field to -1
        SET amountDue field to -1

    // Mutator Methods
    function setPetType(petType):
        SET the petType field to the petType argument provided

    function setPetName(petName):
        SET the petName field to the petName argument provided
    
    function setPetAge(petAge):
        SET the petAge field to the petAge argument provided
    
    function setDogSpace(dogSpace):
        SET the dogSpace field to the dogSpace argument provided
    
    function setCatSpace(catSpace):
        SET the catSpace field to the catSpace argument provided
    
    function setDaysStay(daysStay):
        SET the daysStay field to the daysStay argument provided
    
    function setAmountDue(amountDue):
        SET the amountDue field to the amountDue argument provided

    // Accessor Methods
    function getPetType():
        RETURN the petType field
    
    function getPetName():
        RETURN the petName field
    
    function getPetAge():
        RETURN the petAge field
    
    function getDogSpace():
        RETURN the dogSpace field
    
    function getCatSpace():
        RETURN the catSpace field
    
    function getDaysStay():
        RETURN the daysStay field
    
    function getAmountDue():
        RETURN the amountDue field

    // Pet Check-In Method
    function petCheckIn(arguments):
        finish this...

    // Main Method
    function main(String[] args):
        finish this...    
    
