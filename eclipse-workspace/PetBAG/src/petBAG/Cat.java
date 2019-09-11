package petBAG;

public class Cat extends Pet {

    private int catSpaceNbr;
    
    // Default constructor
    public Cat() {
        catSpaceNbr = -1;
    }
    
    // Parameterized constructor
    public Cat(String petType, String petName) {
        super(petType, petName);
        catSpaceNbr = -1;
    }
    
    public void setCatSpaceNbr(int catSpaceNbr) {
        this.catSpaceNbr = catSpaceNbr;
        return;
    }
    
    public int getCatSpaceNbr() {
        return catSpaceNbr;
    }
    
}
