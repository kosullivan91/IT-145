PROGRAM PetBag:

// ===== Pet.java =====
class Pet():
    DECLARE the private petType field as String
    DECLARE the private petName field as String
    DECLARE the private petAge field as integer
    DECLARE the private dogSpace field as integer
    DECLARE the private catSpace field as integer
    DECLARE the private daysStay field as integer
    DECLARE the private amountDue as double

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
    function checkIn():
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
        STORE the RESULT in the availableSpace variable

        // If space is available
        // Identity whether the pet is new or a return client
        IF availableSpace is true THEN
            PRINT "Has this pet stayed with us before? (Y/N)"
            INPUT Y or N // Yes or No
            STORE the result in the existingCustomer variable
            WHILE existingCustomer is not Y or N
                PRINT "Invalid response.  Please enter Y or N"
                INPUT Y or N
                STORE the result in the existingCustomer variable
            ENDHILE
            
            DECLARE returnClient variable as boolean

            IF existingCustomer is Y THEN
                SET returnClient to true
            ELSE
                SET returnClient to false
            ENDIF

            // If returning customer update pet.  If new customer create pet.
            IF returnClient is true THEN
                CALL updatePet
            ELSE
                CALL createPet
            ENDIF

            // Determine and set the duration of the pet's stay
            PRINT "How many days will the pet be staying with us?"
            INPUT number of days
            STORE the result in the stayDuration variable
            CALL setDaysStay with argument stayDuration

            // Determine whether grooming is needed
            IF petType is dog THEN
                IF daysStay is greater than 2 THEN
                    CALL setGrooming with argument of true
                ELSE
                    CALL setGrooming with argument of false
                ENDIF
            ENDIF

            // Assign Space Number and display it
            // Assign the space based on petType.  Start with the dogSpace/catSpace field values
            // set by the Pet class constructor and decrement for each pet assigned
            // Spaces are assigned in descending order for program simplicity
            IF petType is dog
                CALL setDogSpaceNbr with argument dogSpace 
                CALL setDogSpace with argument dogSpace - 1
                CALL getDogSpaceNbr
                PRINT dogSpaceNbr
            ELSE
                CALL setCatSpaceNbr with argument catSpace
                CALL setCatSpace with argument catSpace - 1
                CALL getCatSpaceNbr
                PRINT catSpaceNbr
            ENDIF            

        ELSE
            PRINT "No Vacancy."
        ENDIF

    // Determine whether boarding space is available and return boolean result
    function checkAvailability(petType):
        IF petType is dog THEN
            IF dogSpace > 0 THEN 
                RETURN true
            ELSE
                RETURN false
            ENDIF
        ELSE
            IF catSpace > 0 THEN 
                RETURN true
            ELSE
                RETURN false
        ENDIF

    function checkOut():
        TODO: N/A: Out of assignment scope
    
    function getPet():
        TODO: N/A: Out of assignment scope
    
    function createPet():
        TODO: N/A: Out of assignment scope
    
    function updatePet():
        TODO: N/A: Out of assignment scope

    function main(String[] args):
        TODO: N/A: Out of assignment scope

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
        SET grooming field to false
    
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
    
    END.