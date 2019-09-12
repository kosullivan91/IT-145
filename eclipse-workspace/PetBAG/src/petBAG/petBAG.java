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
        
        // Test isSpaceAvailable with cat, dog, available space, no space available - PASS
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
        
        // Test Cat Object initialization - PASS
        // Default constructor - PASS
        Cat cat10 = new Cat();
        System.out.println("*****DEFAULT CAT**************");
        System.out.println("*****DEFAULT CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat10.getPetType());
        System.out.println("Pet Name: " + cat10.getPetName());
        System.out.println("Pet Age: " + cat10.getPetAge());
        System.out.println("Dog Space: " + cat10.getDogSpace());
        System.out.println("Cat Space: " + cat10.getCatSpace());
        System.out.println("Days Stay: " + cat10.getDaysStay());
        System.out.println("Amount Due: " + cat10.getAmountDue());
        System.out.println("Space Number: " + cat10.getCatSpaceNbr());
        // Parameterized constructor - PASS
        Cat cat11 = new Cat("cat", "Sabrina");
        System.out.println("*****PARAM CAT**************");
        System.out.println("*******PARAM CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat11.getPetType());
        System.out.println("Pet Name: " + cat11.getPetName());
        System.out.println("Pet Age: " + cat11.getPetAge());
        System.out.println("Dog Space: " + cat11.getDogSpace());
        System.out.println("Cat Space: " + cat11.getCatSpace());
        System.out.println("Days Stay: " + cat11.getDaysStay());
        System.out.println("Amount Due: " + cat11.getAmountDue());
        System.out.println("Space Number: " + cat11.getCatSpaceNbr());
        
        // Test Static field manipulation - PASS    
        // cat1.setDogSpace(22);
        // cat11.setCatSpace(15);
        
        Cat cat12 = new Cat("cat", "Mittens");
        System.out.println("*****PARAM CAT**************");
        System.out.println("*******PARAM CONSTRUCTOR******");
        System.out.println("Pet Type: " + cat12.getPetType());
        System.out.println("Pet Name: " + cat12.getPetName());
        System.out.println("Pet Age: " + cat12.getPetAge());
        System.out.println("Dog Space: " + cat12.getDogSpace());
        System.out.println("Cat Space: " + cat12.getCatSpace());
        System.out.println("Days Stay: " + cat12.getDaysStay());
        System.out.println("Amount Due: " + cat12.getAmountDue());
        System.out.println("Space Number: " + cat12.getCatSpaceNbr());
        
        System.out.println("*****Cat 11 Check NEW SPACE*****");
        System.out.println("Dog Space: " + cat11.getDogSpace());
        System.out.println("Cat Space: " + cat11.getCatSpace());
    }

}
