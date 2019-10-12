public class Cruise {

    // Class Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }

    // print cruise details
    public void printCruiseDetails() {

        // Data should be placed in columns that correspond to the variables:
        // cruise name, cruise ship name, departure port, destination, return port

        int spaceCount;                             // counter for space characters to
                                                    // pad the cruise Name column

        String spaceHolder = "";                    // spaceHolder to pad columns

        String[] spaces = {"","","","",""};             // space character array to set padding for each field column
        int[] spaceCounts = new int[5];                 // array of spaceCounts to set padding lengths

        spaceCounts[0] = 20 - cruiseName.length();      // columns have a fixed width of 20 characters, the
        spaceCounts[1] = 20 - cruiseShipName.length();  // width of the space character count is the fixed
        spaceCounts[2] = 20 - departurePort.length();   // column width less the width of the applicable field
        spaceCounts[3] = 20 - destination.length();
        spaceCounts[4] = 20 - returnPort.length();

        // the for loop iterates over the spaces array and increases
        // each String in the array with the number of spaces equal to
        // the column width not occupied by the field name value,
        // adding space for each character position that remains after
        // subtracting the length of the field value from the fixed
        // column width of 20 characters

        for (int i = 0; i < spaces.length; ++i) {
            for (int j = 0; j < spaceCounts[i]; j++) {
                spaces[i] += " ";
            }
        }

        System.out.println(cruiseName + spaces[0] + cruiseShipName + spaces[1] +
                departurePort + spaces[2] + destination + spaces[3] +
                returnPort);
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}
