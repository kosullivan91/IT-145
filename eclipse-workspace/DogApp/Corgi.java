/* Jeff Perkinson
 * IT-145 T1605
 * September 2019
 */

public class Corgi extends Dog {

    // additional class variables
    // private access modifiers are used to promote encapsulation
    private int weight;
    private int age;

    // constructors
    /* The default constructor is not defined.
     * The parameterized constructor
     * incorporates the type, breed, name, weight, and age fields.
     * If any constructor is defined, the compiler does not implicitly define a 
     * default constructor.  Per zyBooks, best practice is to explicitly
     * define a default constructor and rely on method overloading 
     * for other constructors so that an object creation statement 
     * like Corgi corgi = new Corgi() without arguments remains
     * supported.  The compiler will throw an error if the 
     * default constructor is not defined and a call is made to it. 
     * The default constructor has not been defined here as its
     * use would require additional setter methods under the Dog class
     * that are not part of the UML class diagram provided. 
     */    
    
    // parameterized constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        weight = pounds;
        age = years;
    }

    // mutator methods
    
    // set the member field weight to the argument provided
    public void setWeight(int pounds) {
        weight = pounds;
        return; // good practice is to return even when
                // return type is void to clear the stack frame.
    }
    
    // set the member field age to the argument provided
    public void setAge(int years) {
        age = years;
        return;
    }

    // override toString() method to include additional dog information
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + age +
                " years old and weighs " + weight + " pounds.");
    }

}
