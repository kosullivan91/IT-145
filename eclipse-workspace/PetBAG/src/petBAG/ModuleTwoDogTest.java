package petBAG;

public class ModuleTwoDogTest {
        
    public static void main(String[] args) {
        
        Dog dogObject = new Dog("dog", "Sammy");
        
        //Test constructor
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
        
        System.out.println("******************************");
        
        //Verify new field values
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
                
    }

}
