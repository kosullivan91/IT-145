package petBAG;

public class ModuleTwoDogTest {
        
    public static void main(String[] args) {
        System.out.println("********REFACTOR TESTS********");
        Dog dogObject = new Dog("dog", "Sammy", 25);
        Dog dogObject2 = new Dog();
        
      //Test default constructor
        System.out.println("*****DEFAULT CONSTRUCTOR******");
        System.out.println(dogObject2.getPetType());
        System.out.println(dogObject2.getPetName());
        System.out.println(dogObject2.getPetAge());
        System.out.println(dogObject2.getDogSpace());
        System.out.println(dogObject2.getCatSpace());
        System.out.println(dogObject2.getDaysStay());
        System.out.println(dogObject2.getAmountDue());
        System.out.println(dogObject2.getDogSpaceNbr());
        System.out.println(dogObject2.getDogWeight());
        System.out.println(dogObject2.getGrooming());
        
        //Test non-default constructor
        System.out.println("*****OVERRIDE CONSTRUCTOR*****");
        System.out.println(dogObject.getPetType());
        System.out.println(dogObject.getPetName());
        System.out.println(dogObject.getPetAge());
        System.out.println(dogObject.getDogSpace());
        System.out.println(dogObject.getCatSpace());
        System.out.println(dogObject.getDaysStay());
        System.out.println(dogObject.getAmountDue());
        System.out.println(dogObject.getDogSpaceNbr());
        System.out.println(dogObject.getDogWeight());
        System.out.println(dogObject.getGrooming());

        //Test Setters
        dogObject.setPetType("dog2");
        dogObject.setPetName("Bobby Flay Ruff");
        dogObject.setPetAge(32);
        dogObject.setDogSpace(29);
        dogObject.setCatSpace(12);
        dogObject.setDaysStay(103);
        dogObject.setAmountDue(1067.89);
        dogObject.setDogSpaceNbr(30);
        dogObject.setDogWeight(204);
        dogObject.setGroomming(true);
        
        //Verify new field values
        System.out.println("**********NEW VALUES**********");
        System.out.println(dogObject.getPetType());
        System.out.println(dogObject.getPetName());
        System.out.println(dogObject.getPetAge());
        System.out.println(dogObject.getDogSpace());
        System.out.println(dogObject.getCatSpace());
        System.out.println(dogObject.getDaysStay());
        System.out.println(dogObject.getAmountDue());
        System.out.println(dogObject.getDogSpaceNbr());
        System.out.println(dogObject.getDogWeight());
        System.out.println(dogObject.getGrooming());

        // Verify no dogSpace/catSpace variable change in dogObject2
        System.out.println("*********DOG OBJECT 2*********");
        System.out.println(dogObject2.getDogSpace());
        System.out.println(dogObject2.getCatSpace());
                       
    }

}
