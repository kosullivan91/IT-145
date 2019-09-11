package petBAG;

public class petBAG {

    public static void main(String[] args) {
        // Main program to test the Pet class
        
        Pet cat1 = new Pet();
        
        // Test default constructor - PASS
        System.out.println("*****DEFAULT CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat1.getPetType());
        System.out.println("Pet Name: " + cat1.getPetName());
        System.out.println("Pet Age: " + cat1.getPetAge());
        System.out.println("Dog Space: " + cat1.getDogSpace());
        System.out.println("Cat Space: " + cat1.getCatSpace());
        System.out.println("Days Stay: " + cat1.getDaysStay());
        System.out.println("Amount Due: " + cat1.getAmountDue());
        
        // Test class variable changes and default constructor - PASS
        // cat1.setDogSpace(12);
        // cat1.setCatSpace(11);
        
        Pet cat2 = new Pet();
        System.out.println("*****DEFAULT CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat2.getPetType());
        System.out.println("Pet Name: " + cat2.getPetName());
        System.out.println("Pet Age: " + cat2.getPetAge());
        System.out.println("Dog Space: " + cat2.getDogSpace());
        System.out.println("Cat Space: " + cat2.getCatSpace());
        System.out.println("Days Stay: " + cat2.getDaysStay());
        System.out.println("Amount Due: " + cat2.getAmountDue());

        // Test parameterized constructor, 1st w/o class variable mods (lines 21 and 22) then with - PASS
        Pet cat3 = new Pet("cat", "I AM A CAT");
        System.out.println("*****PARAM CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat3.getPetType());
        System.out.println("Pet Name: " + cat3.getPetName());
        System.out.println("Pet Age: " + cat3.getPetAge());
        System.out.println("Dog Space: " + cat3.getDogSpace());
        System.out.println("Cat Space: " + cat3.getCatSpace());
        System.out.println("Days Stay: " + cat3.getDaysStay());
        System.out.println("Amount Due: " + cat3.getAmountDue());
        
        // Test isSpaceAvailable with cat, dog, available space, no space available
        System.out.println("****isSpaceAvailableTests****");
        System.out.println(cat1.isSpaceAvailable("dog")); // true
        System.out.println(cat1.isSpaceAvailable("cat")); // true
        cat2.setDogSpace(-1);
        System.out.println(cat1.isSpaceAvailable("dog")); // false
        System.out.println(cat1.isSpaceAvailable("cat")); // true
        cat3.setCatSpace(-1);
        System.out.println(cat1.isSpaceAvailable("dog")); // false
        System.out.println(cat1.isSpaceAvailable("cat")); // false
        cat1.setDogSpace(2);
        System.out.println(cat2.isSpaceAvailable("dog")); // true
        System.out.println(cat2.isSpaceAvailable("cat")); // false
        cat3.setDogSpace(30);
        cat2.setCatSpace(12);
        System.out.println(cat1.isSpaceAvailable("dog")); // true
        System.out.println(cat1.isSpaceAvailable("cat")); // true
    }

}
