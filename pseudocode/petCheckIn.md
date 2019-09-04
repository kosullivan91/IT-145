// ===== Pet.java =====
class Pet():
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
        // Determine whether pet is cat or dog, instantiate the appropriate object type, and set the petType field with the result
        PRINT “What type of pet do you have?”
        INPUT customer’s pet type
        STORE the customer’s pet type in the customerPetType variable
        WHILE customerPetType is not cat or dog
            PRINT “Invalid pet type.  Please specify cat or dog.”
            INPUT customer’s pet type
            STORE the customer’s pet type in the customerPetType variable
        ENDWHILE
        IF customerPetType is Dog THEN
            Instantiate a new object of type Dog      
            CALL setPetType with argument of dog
        ELSE
            Instantitate a new object of type Cat     
            CALL setPetType with argument of cat
        ENDIF
        
        // Determine whether boarding space is available and store the result
        CALL checkAvailability with argument petType
        STORE the RESULT in the availableSpace variable as boolean

        // If space is available
        // Identity whether the pet is new or a return client
        IF availableSpace is TRUE THEN
            PRINT "Has this pet stayed with us before?"
            INPUT Yes or No
            STORE the answer in the existingCustomer variable as boolean

            // If returning customer update pet.  If new customer create pet.
            IF existingCustomer is TRUE THEN
                CALL updatePet
            ELSE
                CALL createPet
            ENDIF

            // Determine and set the duration of the pet's stay
            PRINT "How many days will the pet be staying with us?"
            INPUT number of days
            CALL setDaysStay with argument of number of days INPUT

            // Determine whether grooming is needed
            IF petType is dog THEN
                IF daysStay is greater than 2 THEN
                    CALL setGrooming with argument of TRUE
                ELSE
                    CALL setGrooming with argument of FALSE
                ENDIF
            ENDIF

            // Assign Space Number
            // Assign the space based on petType.  Start with the field value
            // set by the class constructor and decrement for each pet assigned
            IF petType is dog
                CALL setDogSpace with argument dogSpace
                DECREMENT dogSpace
                CALL getDogSpace
                PRINT dogSpace
            ELSE
                CALL setCatSpace with argument catSpace
                DECREMENT catSpace
                CALL getCatSpace
                PRINT catSpace
            ENDIF            

        ELSE
            PRINT "No Vacancy."
        ENDIF

    // Determine whether boarding space is available and return boolean result
    function checkAvailability(petType):
        IF petType is Dog THEN
            IF dogSpace > 0 THEN 
                RETURN TRUE
            ELSE
                RETURN FALSE
            ENDIF
        ELSE
            IF catSpace > 0 THEN 
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

// ===== Cat.java =====
class Cat() extends Pet(): // Derived from Pet() class
    DECLARE the public catSpaceNbr field as int

    // Default Constructor
    // In Java, constructor of base class with no argument gets called automatically in derived class constructor
    // Base class fields need not be set in the derived class constructor
    function Cat():
        SET catSpaceNbr field to -1 

    // Mutator Method
    function setCatSpaceNbr(catSpaceNbr):
        SET the catSpaceNbr field to the catSpaceNbr argument provided

    // Accessor Method
    function getCatSpaceNbr():
        RETURN the catSpaceNbr field

// ===== Dog.java =====
class Dog() extends Pet(): // Derived from Pet() class
    DECLARE the public dogSpaceNbr field as int
    DECLARE the public dogWeight field as double
    DECLARE the public grooming field as boolean

    // Default Constructor
    // In Java, constructor of base class with no argument gets called automatically in derived class constructor
    // Base class fields need not be set in the derived class constructor
    function Dog():
        SET dogSpaceNbr field to -1
        SET dogWeight field to 0.0
        SET grooming field to FALSE
    
    // Mutator Methods
    function setDogSpaceNbr(dogSpaceNbr):
        SET the dogSpaceNbr field to the dogSpaceNbr argument provided
    
    function setDogWeight(dogWeight):
        SET the dogWeight field to the dogWeight argument provided

    function setGrooming(grooming):
        SET the grooming field to the grooming argument provided

    // Accessor Methods
    function getDogSpaceNbr():
        RETURN the dogSpaceNbr field
    
    function getDogWeight():
        RETURN the dogWeight field
    
    function getGrooming():
        RETURN the grooming field