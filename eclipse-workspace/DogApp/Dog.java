/* Jeff Perkinson
 * IT-145 T1605
 * September 2019
 */

public class Dog {

    // class variables
    // private access modifiers are used to promote encapsulation
    private String type;
    private String breed;
    private String name;
    private String topTrick; 

    // constructors
   /* Two constructors are defined.  The default constructor
    * takes no parameters and the parameterized constructor
    * incorporates the type, breed, and name fields.
    * If any constructor is defined, the compiler does not implicitly define a 
    * default constructor.  Per zyBooks, best practice is to explicitly
    * define a default constructor and rely on method overloading 
    * for other constructors so that an object creation statement 
    * like Dog dog = new Dog() without arguments remains
    * supported.  The compiler will throw an error if the 
    * default constructor is not defined and a call is made to it. 
    */
    
    // default constructor
    public Dog() {
        type = "";
        breed = "";
        name = "";
        topTrick = "";
    }
    
    // parameterized constructor
    public Dog (String type, String breed, String name) {
        this.type = type;   // use of 'this' keyword refers to the  
        this.breed = breed; // object being instantiated and sets its
        this.name = name;   // member fields to the arguments passed
        topTrick = "";      // in during the instantiation call.
    }

    // methods

    // setter method for topTrick
    public void setToptrick(String trick) {
        topTrick = trick;
        
        return; // good practice is to return even when
                // return type is void to clear the stack frame.
    }

    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
