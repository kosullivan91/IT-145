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
        SET dogSpace field to 30 // Dog spaces available
        SET catSpace field to 12 // Cat spaces available
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

    // Functional Methods
    function checkIn(dogSpace, catSpace):
        // Determine whether pet is cat or dog and set the petType field with the result
        PRINT “What type of pet do you have?”
        INPUT customer’s pet type
        STORE the customer’s pet type in the petType variable
        WHILE petType is not cat or dog
            PRINT “Invalid pet type.  Please specify cat or dog.”
            INPUT customer’s pet type
            STORE the customer’s pet type in the petType variable
        CALL setPetType with argument petType
        
        // Determine whether boarding space is available and store the result
        CALL checkAvailability with argument petType
        STORE the RESULT in the availableSpace variable as boolean

        // If space is available, identity whether the pet is new or a return client
        IF availableSpace is TRUE THEN
            PRINT "Has this pet stayed with us before?"
            INPUT Yes or No
            STORE the answer in the existingCustomer variable as boolean
        ELSE
            PRINT "No boarding space available."
        ENDIF

        // If returning customer update pet.  If new customer create pet.
        IF availableSpace is TRUE and existingCustomer is TRUE THEN
            CALL updatePet
        ENDIF

        IF availableSpace is TRUE and exitingCustomer is FALSE THEN
            CALL createPet
        ENDIF
    
    // Determine whether boarding space is available and return boolean result
    function checkAvailability(petType):
        IF petType is Dog THEN
            IF dogSpace > 0 THEN // TODO: Turn 0 into a variable?
                RETURN TRUE
            ELSE
                RETURN FALSE
            ENDIF
        ELSE
            IF catSpace > 0 THEN // TODO: Turn 0 into a variable?
                RETURN TRUE
            ELSE
                RETURN FALSE
        ENDIF

    function checkOut():
        TODO: Out of assignment scope
    
    function getPet():
        TODO: Out of assignment scope
    
    function createPet():
        TODO: Out of assignment scope
    
    function updatePet():
        TODO: Out of assignment scope

    function main(String[] args):
        TODO: Out of assignment scope
    
