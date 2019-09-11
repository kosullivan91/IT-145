package petBAG;

public class petBAG {

    public static void main(String[] args) {
        // Main program to test the Pet class
        
        Pet cat1 = new Pet();
        
        // Test default constructor
        System.out.println("*****DEFAULT CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat1.getPetType());
        System.out.println("Pet Name: " + cat1.getPetName());
        System.out.println("Pet Age: " + cat1.getPetAge());
        System.out.println("Dog Space: " + cat1.getDogSpace());
        System.out.println("Cat Space: " + cat1.getCatSpace());
        System.out.println("Days Stay: " + cat1.getDaysStay());
        System.out.println("Amount Due: " + cat1.getAmountDue());
        
        // Test class variable changes and default constructor
        cat1.setDogSpace(12);
        cat1.setCatSpace(11);
        
        Pet cat2 = new Pet();
        System.out.println("*****DEFAULT CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat2.getPetType());
        System.out.println("Pet Name: " + cat2.getPetName());
        System.out.println("Pet Age: " + cat2.getPetAge());
        System.out.println("Dog Space: " + cat2.getDogSpace());
        System.out.println("Cat Space: " + cat2.getCatSpace());
        System.out.println("Days Stay: " + cat2.getDaysStay());
        System.out.println("Amount Due: " + cat2.getAmountDue());

    }

}
