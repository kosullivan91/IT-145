PROGRAM checkIn:

function checkIn():
        PRINT “What type of pet do you have?”
        INPUT the customer’s pet type
        WHILE the customer's pet type is not cat or dog
            PRINT “Invalid pet type.  Please specify cat or dog.”
            INPUT the customer’s pet type
        ENDWHILE
        
        IF the customer's pet type is a dog THEN
            IF available dog space is greater than 0 THEN 
                RETURN true
            ELSE
                RETURN false
            ENDIF
        ELSE
            IF available cat space is greater than 0 THEN 
                RETURN true
            ELSE
                RETURN false
            ENDIF
        ENDIF
                
        IF there is space available THEN
            PRINT "Has this pet stayed with us before? (Y/N)"
            INPUT Y or N
            WHILE input is not Y or N
                PRINT "Invalid response.  Please enter Y or N."
                INPUT Y or N
            ENDHILE
            
            IF customer is an existing client THEN
                UPDATE existing pet information
            ELSE
                ADD new pet information
            ENDIF

            PRINT "How many days will the pet be staying with us?"
            INPUT the number of days
           
            IF the customer's pet type is a dog THEN
                IF the duration of the stay is greater than 2 days THEN
                    SET grooming to TRUE
                ELSE
                    SET grooming to FALSE
                ENDIF
            ENDIF

            IF the customer's pet type is a dog
                SET the dog's space number
                DECREMENT available dog space
                PRINT dog's space number
            ELSE
                SET the cat's space number
                DECREMENT available cat space
                PRINT cat's space number
            ENDIF            

        ELSE
            PRINT "No Vacancy."
        ENDIF

END.