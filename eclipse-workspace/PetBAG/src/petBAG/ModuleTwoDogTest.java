package petBAG;

public class ModuleTwoDogTest {
        
    public static void main(String[] args) {
        
        Dog dogObject = new Dog("dog", "Sammy");
        
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
